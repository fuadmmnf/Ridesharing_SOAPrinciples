package com.example.rideshare.repositories;


import com.example.rideshare.gen.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class TripRepository {
    private static final Map<String, Trip> trips = new HashMap<>();

    @PostConstruct
    public void initData() {
        TripHeader th = new TripHeader();
        TripIdentifier ti = new TripIdentifier();
        ti.setId("1");
        th.setTripIdentifier(ti);
        th.setStatus(Status.REQUESTED);


        PlaceHeader ph1 = new PlaceHeader();
        PlaceIdentifier pi1 = new PlaceIdentifier();
        ph1.setId(pi1);
        ph1.setName("Joynag road, Lalbagh");
        PlaceHeader ph2 = new PlaceHeader();
        PlaceIdentifier pi2 = new PlaceIdentifier();
        ph2.setId(pi2);
        ph2.setName("IIT, DU");

        RouteHeader rh = new RouteHeader();
        rh.setSource(ph1);
        rh.setDestination(ph2);
        rh.setDistance(1000);


        Trip trip = new Trip();
        trip.setHeader(th);
        trip.setRouteHeader(rh);
        trip.setEstTime(12312);
        trip.setFare(80);
        trip.setMedium("Bike");

        trips.put("1", trip);
    }

    public void create(Trip trip) {
        TripIdentifier ti = new TripIdentifier();
        ti.setId("" + trips.size() + 1);
        TripHeader th = new TripHeader();
        th.setStatus(Status.ACTIVE);
        th.setTripIdentifier(ti);

        trip.setHeader(th);
        trips.put(trip.getHeader().getTripIdentifier().getId(), trip);
    }

    public void update(Trip trip) {
        trips.replace(trip.getHeader().getTripIdentifier().getId(), trip);
    }

    public void delete(String id) {
        trips.remove(id);
    }


    public Trip find(String id) {
        return trips.get(id);
    }
}
