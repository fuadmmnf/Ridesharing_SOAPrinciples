package com.example.rideshare.endpoints;


import com.example.rideshare.gen.AcknowledgementCode;
import com.example.rideshare.gen.AcknowledgementCodeResponse;
import com.example.rideshare.repositories.ManageRideSharingRepository;
import generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ManageRideSharingEndpoint {
    private static final String NAMESPACE_URI = "http://www.example.com/rideshare/gen";

    private ManageRideSharingRepository manageRideSharingRepository;

    @Autowired
    public ManageRideSharingEndpoint(ManageRideSharingRepository manageRideSharingRepository) {
        this.manageRideSharingRepository = manageRideSharingRepository;
    }

    private AcknowledgementCodeResponse createAckResponse(AcknowledgementCode code) {
        AcknowledgementCodeResponse codeResponse = new AcknowledgementCodeResponse();
        codeResponse.setAcknowledgementcode(code);
        return codeResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetRideOptionsRequest")
    @ResponsePayload
    public GetRideOptionsResponse getRideOptions(@RequestPayload GetRideOptionsRequest request) {
        return new GetRideOptionsResponse();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CreateRideRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse createRideRequest(@RequestPayload CreateRideRequest request) {
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
