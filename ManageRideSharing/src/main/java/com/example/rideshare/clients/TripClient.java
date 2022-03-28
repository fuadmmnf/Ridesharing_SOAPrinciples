package com.example.rideshare.clients;

import com.example.rideshare.gen.AcknowledgementCodeResponse;
import com.example.rideshare.gen.Trip;
import com.example.rideshare.gen.TripHeader;
import generated.CreateTripRequest;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class TripClient extends WebServiceGatewaySupport {
    public AcknowledgementCodeResponse createTrip(TripHeader tripHeader) {
        CreateTripRequest createTripRequest = new CreateTripRequest();
        Trip trip = new Trip();
        trip.setHeader(tripHeader);
        createTripRequest.setTrip(trip);

        return (AcknowledgementCodeResponse) getWebServiceTemplate()
                .marshalSendAndReceive(createTripRequest);
    }
}
