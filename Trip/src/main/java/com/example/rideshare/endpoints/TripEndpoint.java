package com.example.rideshare.endpoints;




import com.example.rideshare.gen.*;
import com.example.rideshare.repositories.TripRepository;
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateTripRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse createTrip(@RequestPayload CreateTripRequest createTripRequest) {
        return this.createAckResponse(AcknowledgementCode.CREATED);
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateTripRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse updateTrip(@RequestPayload UpdateTripRequest updateTripRequest) {
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }
}
