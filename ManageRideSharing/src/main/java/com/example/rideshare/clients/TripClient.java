package com.example.rideshare.clients;

import generated.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class TripClient extends WebServiceGatewaySupport {
    public AcknowledgementCode createTrip(Trip trip) {
        CreateTripRequest createTripRequest = new CreateTripRequest();
        createTripRequest.setTrip(trip);

        return ((AcknowledgementCodeResponse) getWebServiceTemplate()
                .marshalSendAndReceive(createTripRequest)).getAcknowledgementcode();
    }


    public Trip getTrip(TripIdentifier tripIdentifier) {
        GetTripDetailsRequest getTripDetailsRequest = new GetTripDetailsRequest();
        getTripDetailsRequest.setTripIdentifier(tripIdentifier);

        return ((TripDocument) getWebServiceTemplate()
                .marshalSendAndReceive(getTripDetailsRequest)).getTrip();
    }

    public AcknowledgementCode updateTrip(Trip trip) {
        UpdateTripRequest updateTripRequest = new UpdateTripRequest();
        updateTripRequest.setTrip(trip);

        return ((AcknowledgementCodeResponse) getWebServiceTemplate()
                .marshalSendAndReceive(updateTripRequest)).getAcknowledgementcode();
    }
}
