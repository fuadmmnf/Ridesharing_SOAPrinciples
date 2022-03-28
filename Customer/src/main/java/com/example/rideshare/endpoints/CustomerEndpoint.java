package com.example.rideshare.endpoints;


import com.example.rideshare.gen.*;
import com.example.rideshare.repositories.CustomerRepository;
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

//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerRequest")
//    @ResponsePayload
//    public AcknowledgementCodeResponse registerCustomer(@RequestPayload CustomerRequest customerRequest) {
//        Customer c = new Customer();
//        c.setName(customerRequest.getName());
//        c.setMobile(customerRequest.getMobile());
//        c.setAddress(customerRequest.getAddress());
//        customerRepository.createCustomer(c);
//
//        return this.createAckResponse(AcknowledgementCode.CREATED);
//    }
//
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerDocument")
//    @ResponsePayload
//    public AcknowledgementCodeResponse updateProfile(@RequestPayload CustomerDocument customerDocument) {
//        customerRepository.updateCustomer(customerDocument.getCustomer());
//
//        return this.createAckResponse(AcknowledgementCode.UPDATED);
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerIdentifier")
//    @ResponsePayload
//    public AcknowledgementCodeResponse banCustomer(@RequestPayload CustomerIdentifier customerIdentifier) {
//        customerRepository.deleteCustomer(customerIdentifier.getId());
//        return this.createAckResponse(AcknowledgementCode.DELETED);
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerIdentifier")
//    @ResponsePayload
//    public CustomerDocument getDetails(@RequestPayload CustomerIdentifier customerIdentifier) {
//        Customer c = customerRepository.findCustomer(customerIdentifier.getId());
//        CustomerDocument cd = new CustomerDocument();
//        cd.setCustomer(c);
//        return cd;
//    }
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerIdentifier")
//    @ResponsePayload
//    public PaymentHeader getPaymentHeader(@RequestPayload CustomerIdentifier customerIdentifier) {
//        return customerRepository.getCustomerPaymentHeader(customerIdentifier.getId());
//    }
//
//
//    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "CustomerPaymentMedium")
//    @ResponsePayload
//    public AcknowledgementCodeResponse storePaymentInfo(@RequestPayload CustomerPaymentMedium customerPaymentMedium) {
//        customerRepository.setCustomerPaymentHeader(customerPaymentMedium.getCustomerIdentifier().getId(), customerPaymentMedium.getPaymentHeader());
//        return createAckResponse(AcknowledgementCode.UPDATED);
//    }
}
