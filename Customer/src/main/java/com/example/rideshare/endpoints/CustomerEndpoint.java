package com.example.rideshare.endpoints;


import com.example.rideshare.gen.*;
import com.example.rideshare.repositories.CustomerRepository;
import generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CustomerEndpoint {
    private static final String NAMESPACE_URI = "http://www.example.com/rideshare/gen";

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerEndpoint(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    private AcknowledgementCodeResponse createAckResponse(AcknowledgementCode code) {
        AcknowledgementCodeResponse codeResponse = new AcknowledgementCodeResponse();
        codeResponse.setAcknowledgementcode(code);
        return codeResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "RegisterCustomerRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse registerCustomer(@RequestPayload RegisterCustomerRequest registerCustomerRequest) {
        Customer c = new Customer();
        c.setName(registerCustomerRequest.getName());
        c.setMobile(registerCustomerRequest.getMobile());
        c.setAddress(registerCustomerRequest.getAddress());
        customerRepository.createCustomer(c);

        return this.createAckResponse(AcknowledgementCode.CREATED);
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "UpdateProfileRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse updateProfile(@RequestPayload UpdateProfileRequest updateProfileRequest) {
        customerRepository.updateCustomer(updateProfileRequest.getCustomer());

        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "BanCustomerRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse banCustomer(@RequestPayload BanCustomerRequest banCustomerRequest) {
        customerRepository.deleteCustomer(banCustomerRequest.getCustomerIdentifier().getId());
        return this.createAckResponse(AcknowledgementCode.DELETED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetDetailsRequest")
    @ResponsePayload
    public CustomerDocument getDetails(@RequestPayload GetDetailsRequest getDetailsRequest) {
        Customer c = customerRepository.findCustomer(getDetailsRequest.getCustomerIdentifier().getId());
        CustomerDocument cd = new CustomerDocument();
        cd.setCustomer(c);
        return cd;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetPaymentMediumRequest")
    @ResponsePayload
    public PaymentHeader getPaymentMedium(@RequestPayload GetPaymentMediumRequest getPaymentMediumRequest) {
        return customerRepository.getCustomerPaymentHeader(getPaymentMediumRequest.getCustomerIdentifier().getId());
    }


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StorePaymentInfoRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse storePaymentInfo(@RequestPayload StorePaymentInfoRequest storePaymentInfoRequest) {
        customerRepository.setCustomerPaymentHeader(storePaymentInfoRequest.getCustomerIdentifier().getId(), storePaymentInfoRequest.getPaymentHeader());
        return createAckResponse(AcknowledgementCode.UPDATED);
    }
}
