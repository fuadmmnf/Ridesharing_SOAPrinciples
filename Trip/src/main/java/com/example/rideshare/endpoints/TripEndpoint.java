package com.example.rideshare.endpoints;




import com.example.rideshare.gen.AcknowledgementCode;
import com.example.rideshare.gen.AcknowledgementCodeResponse;
import com.example.rideshare.gen.TripHeaderDocument;
import com.example.rideshare.repositories.TripRepository;
import generated.AdjustTripMetricsRequest;
import generated.CreateTripRequest;
import generated.GetTripSummaryRequest;
import generated.UpdateTripRequest;
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

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateTripStateRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse updateTripState(@RequestPayload UpdateTripRequest updateTripRequest) {
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AdjustTripMetricsRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse adjustTripMetrics(@RequestPayload AdjustTripMetricsRequest adjustTripMetricsRequest) {
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTripSummaryRequest")
    @ResponsePayload
    public TripHeaderDocument getTripSummary(@RequestPayload GetTripSummaryRequest getTripSummaryRequest) {
        return new TripHeaderDocument();
    }
}
