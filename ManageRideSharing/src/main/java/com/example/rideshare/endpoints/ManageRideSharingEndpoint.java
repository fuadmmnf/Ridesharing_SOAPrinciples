package com.example.rideshare.endpoints;


import com.example.rideshare.clients.TripClient;
import com.example.rideshare.gen.*;
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
    private static final String NAMESPACE_URI = "http://www.example.com/rideshare/gen";

    private ManageRideSharingRepository manageRideSharingRepository;
    private TripClient tripClient;

    @Autowired
    public ManageRideSharingEndpoint(ManageRideSharingRepository manageRideSharingRepository, TripClient tripClient) {
        this.manageRideSharingRepository = manageRideSharingRepository;
        this.tripClient = tripClient;
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
        //calculate billing based on routeHeader attributes (source, destination, distance) as business specific task
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
        tripClient.createTrip(request.getTripHeader()); // header contains string hash as ID so, id can be  uniquely calculated without creating

        RideSharingTrip rideSharingTrip = new RideSharingTrip();
        rideSharingTrip.setTripIdentifier(request.getTripHeader().getTripIdentifier());
        rideSharingTrip.setCustomerIdentifier(request.getCustomerIdentifier());
        rideSharingTrip.setDriver("");
        manageRideSharingRepository.createRideSharingTrip(rideSharingTrip);
        return this.createAckResponse(AcknowledgementCode.CREATED);
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateRideStateRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse updateRideState(@RequestPayload UpdateRideStateRequest request) {
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StoreFeedbackRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse storeFeedback(@RequestPayload StoreFeedbackRequest request) {
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }
}