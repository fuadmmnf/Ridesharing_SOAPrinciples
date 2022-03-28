package com.example.rideshare.endpoints;



//import com.example.rideshare.gen.CountryRequest;
//import com.example.rideshare.gen.CountryResponse;
import com.example.rideshare.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PaymentEndpoint {
    private static final String NAMESPACE_URI = "http://www.example.com/rideshare/gen";

    private PaymentRepository countryRepository;

    @Autowired
    public PaymentEndpoint(PaymentRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CountryRequest")
//    @ResponsePayload
//    public CountryResponse getCountry(@RequestPayload CountryRequest request) {
//        CountryResponse response = new CountryResponse();
//        response.setCountry(countryRepository.findCountry(request.getName()));
//
//        return response;
//    }
}
