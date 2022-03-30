package com.example.rideshare.endpoints;


import com.example.rideshare.clients.*;
import com.example.rideshare.repositories.ManageRideSharingRepository;
import generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Arrays;

@Endpoint
public class ManageRideSharingEndpoint {
    private static final String NAMESPACE_URI = "";

    private ManageRideSharingRepository manageRideSharingRepository;
    private TripClient tripClient;
    private PaymentClient paymentClient;

    @Autowired
    public ManageRideSharingEndpoint(ManageRideSharingRepository manageRideSharingRepository, TripClient tripClient, PaymentClient paymentClient) {
        this.manageRideSharingRepository = manageRideSharingRepository;
        this.tripClient = tripClient;
        this.paymentClient = paymentClient;
    }

    private AcknowledgementCodeResponse createAckResponse(AcknowledgementCode code) {
        AcknowledgementCodeResponse codeResponse = new AcknowledgementCodeResponse();
        codeResponse.setAcknowledgementcode(code);
        return codeResponse;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetRideOptionsRequest")
    @ResponsePayload
    public GetRideOptionsResponse getRideOptions(@RequestPayload GetRideOptionsRequest getRideOptionsRequest) {
        RouteHeader routeHeader = getRideOptionsRequest.getRouteHeader();
        //calculate billing based on routeHeader attributes (source, destination, distance) as business specific task,
        // the route header can be obtained from consuming another task service concentrated on route calculation
        GetRideOptionsResponse getRideOptionsResponse = new GetRideOptionsResponse();

        RideMode rideMode1 = new RideMode();
        rideMode1.setFare(120);
        rideMode1.setMedium("Bike");
        RideMode rideMode2 = new RideMode();
        rideMode2.setFare(300);
        rideMode1.setMedium("Car");

        getRideOptionsResponse.getRideMode().addAll(Arrays.asList(rideMode1, rideMode2)); // as getter returns reference, adding to original list

        return getRideOptionsResponse;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateRideRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse createRideRequest(@RequestPayload CreateRideRequest request) {
        tripClient.createTrip(request.getTrip()); // called when user confirms ride

        RideSharingTrip rideSharingTrip = new RideSharingTrip();
        rideSharingTrip.setTripIdentifier(request.getTrip().getHeader().getTripIdentifier());
        rideSharingTrip.setCustomerIdentifier(request.getCustomerIdentifier());
        rideSharingTrip.setDriver("");
        manageRideSharingRepository.create(rideSharingTrip);
        return this.createAckResponse(AcknowledgementCode.CREATED);
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateRideStateRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse updateRideState(@RequestPayload UpdateRideStateRequest updateRideStateRequest) {
        Trip trip = tripClient.getTrip(updateRideStateRequest.getTripIdentifier());
        trip.setHeader(updateRideStateRequest.getTripHeader());
        tripClient.updateTrip(trip);
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StoreFeedbackRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse storeFeedback(@RequestPayload StoreFeedbackRequest storeFeedbackRequest) {
        Trip trip = tripClient.getTrip(storeFeedbackRequest.getTripIdentifier());
        trip.setFeedback(storeFeedbackRequest.getFeedback());
        tripClient.updateTrip(trip);
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "MakePaymentRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse makePayment(@RequestPayload MakePaymentRequest makePaymentRequest) {
        Trip trip = tripClient.getTrip(makePaymentRequest.getTripIdentifier());
        System.out.println(makePaymentRequest.getTripIdentifier().getId());
        paymentClient.createPayment(makePaymentRequest.getPayment());

        TripHeader th = trip.getHeader();
        th.setStatus(Status.FINISHED);
        trip.setHeader(th);
        tripClient.updateTrip(trip);

        RideSharingTrip rideSharingTrip = manageRideSharingRepository.find(makePaymentRequest.getTripIdentifier().getId());
        rideSharingTrip.setPaymentIdentifier(makePaymentRequest.getPayment().getHeader().getId());
        manageRideSharingRepository.update(rideSharingTrip);
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }
}