package com.example.rideshare.endpoints;


import com.example.rideshare.gen.*;
import com.example.rideshare.repositories.TripRepository;
import generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class TripEndpoint {
    private static final String NAMESPACE_URI = "http://www.example.com/rideshare/gen";

    private TripRepository tripRepository;

    @Autowired
    public TripEndpoint(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    private AcknowledgementCodeResponse createAckResponse(AcknowledgementCode code) {
        AcknowledgementCodeResponse codeResponse = new AcknowledgementCodeResponse();
        codeResponse.setAcknowledgementcode(code);
        return codeResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetDetailsRequest")
    @ResponsePayload
    public TripDocument getDetails(@RequestPayload GetDetailsRequest getDetailsRequest) {
        TripDocument tripDocument = new TripDocument();
        tripDocument.setTrip(tripRepository.find(getDetailsRequest.getTripIdentifier().getId()));
        return tripDocument;
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateTripRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse createTrip(@RequestPayload CreateTripRequest createTripRequest) {
        tripRepository.createTrip(createTripRequest.getTrip());
        return this.createAckResponse(AcknowledgementCode.CREATED);
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateTripRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse updateTrip(@RequestPayload UpdateTripRequest updateTripRequest) {
        tripRepository.updateTrip(updateTripRequest.getTrip());
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateTripStateRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse updateTripState(@RequestPayload UpdateTripStateRequest updateTripStateRequest) {
        Trip trip = tripRepository.find(updateTripStateRequest.getTripHeader().getTripIdentifier().getId());
        trip.setHeader(updateTripStateRequest.getTripHeader());
        tripRepository.updateTrip(trip);
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AdjustTripMetricsRequest")
//    @ResponsePayload
//    public AcknowledgementCodeResponse adjustTripMetrics(@RequestPayload AdjustTripMetricsRequest adjustTripMetricsRequest) {
//        return this.createAckResponse(AcknowledgementCode.UPDATED);
//    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTripSummaryRequest")
    @ResponsePayload
    public TripHeaderDocument getTripSummary(@RequestPayload GetTripSummaryRequest getTripSummaryRequest) {
        TripHeaderDocument tripHeaderDocument = new TripHeaderDocument();
        tripHeaderDocument.setTripHeader(tripRepository.find(getTripSummaryRequest.getTripIdentifier().getId()).getHeader());
        return tripHeaderDocument;
    }
}
