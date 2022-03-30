package com.example.rideshare.repositories;



;
import generated.RideSharingTrip;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class ManageRideSharingRepository {
    private static final Map<String, RideSharingTrip> trips = new HashMap<>();

    @PostConstruct
    public void initData() {
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
