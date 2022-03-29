package com.example.rideshare.clients;

import com.example.rideshare.gen.*;
import generated.CreateTripRequest;
import generated.GetTripDetailsRequest;
import generated.UpdateTripRequest;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class TripClient extends WebServiceGatewaySupport {
    public AcknowledgementCode createTrip(TripHeader tripHeader) {
        CreateTripRequest createTripRequest = new CreateTripRequest();
        Trip trip = new Trip();
        trip.setHeader(tripHeader);
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
