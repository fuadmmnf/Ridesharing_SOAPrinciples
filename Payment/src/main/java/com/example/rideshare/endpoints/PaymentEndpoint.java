package com.example.rideshare.endpoints;



//import com.example.rideshare.gen.CountryRequest;
//import com.example.rideshare.gen.CountryResponse;
import com.example.rideshare.gen.AcknowledgementCode;
import com.example.rideshare.gen.AcknowledgementCodeResponse;
import com.example.rideshare.repositories.PaymentRepository;
import generated.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class PaymentEndpoint {
    private static final String NAMESPACE_URI = "http://www.example.com/rideshare/gen";

    private PaymentRepository paymentRepository;

    @Autowired
    public PaymentEndpoint(PaymentRepository countryRepository) {
        this.paymentRepository = countryRepository;
    }

    private AcknowledgementCodeResponse createAckResponse(AcknowledgementCode code) {
        AcknowledgementCodeResponse codeResponse = new AcknowledgementCodeResponse();
        codeResponse.setAcknowledgementcode(code);
        return codeResponse;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "InitiatePaymentRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse initiatePayment(@RequestPayload InitiatePaymentRequest initiatePaymentRequest) {
        return this.createAckResponse(AcknowledgementCode.CREATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HandlePaymentSuccessRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse handlePaymentSuccess(@RequestPayload HandlePaymentSuccessRequest handlePaymentSuccessRequest) {
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "HandlePaymentFailureRequest")
    @ResponsePayload
    public AcknowledgementCodeResponse handlePaymentFailure(@RequestPayload HandlePaymentFailureRequest handlePaymentFailureRequest) {
        return this.createAckResponse(AcknowledgementCode.UPDATED);
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetTransactionsRequest")
    @ResponsePayload
    public GetTransactionsResponse getTransactions(@RequestPayload GetTransactionsRequest getTransactionsRequest) {
        return new GetTransactionsResponse();
    }

}
