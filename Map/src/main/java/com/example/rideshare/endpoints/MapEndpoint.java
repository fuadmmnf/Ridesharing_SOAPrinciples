package com.example.rideshare.endpoints;


//import com.example.rideshare.gen.CountryRequest;
//import com.example.rideshare.gen.CountryResponse;

import com.example.rideshare.gen.PlaceDocument;
import com.example.rideshare.gen.PlaceHeaderDocument;
import com.example.rideshare.gen.RouteDocument;
import com.example.rideshare.gen.RouteHeaderDocument;
import com.example.rideshare.repositories.MapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class MapEndpoint {
    private static final String NAMESPACE_URI = "";

    private MapRepository mapRepository;

    @Autowired
    public MapEndpoint(MapRepository mapRepository) {
        this.mapRepository = mapRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RouteHeaderDocument")
    @ResponsePayload
    public RouteDocument calculateRoute(@RequestPayload RouteHeaderDocument routeHeaderDocument) {
        return new RouteDocument();
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "PlaceHeaderDocument")
    @ResponsePayload
    public PlaceDocument calculateRoute(@RequestPayload PlaceHeaderDocument placeHeaderDocument) {
        return new PlaceDocument();
    }
}
