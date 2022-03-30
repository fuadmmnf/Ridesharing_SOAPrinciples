package com.example.rideshare.repositories;



;
import generated.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class ManageRideSharingRepository {
    private static final Map<String, RideSharingTrip> trips = new HashMap<>();

    @PostConstruct
    public void initData() {
        RideSharingTrip rideSharingTrip = new RideSharingTrip();

        PaymentIdentifier pi = new PaymentIdentifier();
        pi.setId("1");
        rideSharingTrip.setPaymentIdentifier(pi);

        TripIdentifier ti = new TripIdentifier();
        ti.setId("1");
        rideSharingTrip.setTripIdentifier(ti);

        RideMode rideMode = new RideMode();
        rideMode.setMedium("Bike");
        rideMode.setFare(80);
        rideSharingTrip.setRideMode(rideMode);
        rideSharingTrip.setDriver("mofij");

        CustomerIdentifier ci = new CustomerIdentifier();
        ci.setId("1");
        rideSharingTrip.setCustomerIdentifier(ci);
        trips.put("1", rideSharingTrip);
    }

    public void create(RideSharingTrip rideSharingTrip) {
        trips.put("" + trips.size() + 1, rideSharingTrip);
    }

    public void update(RideSharingTrip rideSharingTrip) {
        trips.replace(rideSharingTrip.getTripIdentifier().getId(), rideSharingTrip);
    }

    public RideSharingTrip find(String id) {
        return trips.get(id);
    }
}
