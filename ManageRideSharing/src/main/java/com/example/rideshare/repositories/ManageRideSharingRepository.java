package com.example.rideshare.repositories;



import com.example.rideshare.gen.RideSharingTrip;
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

    public RideSharingTrip createRideSharingTrip(RideSharingTrip rideSharingTrip) {
        return trips.put("" + trips.size() + 1, rideSharingTrip);
    }
}
