package com.example.rideshare.clients;

import generated.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class PaymentClient extends WebServiceGatewaySupport {
    public AcknowledgementCode createPayment(Payment payment) {
        InitiatePaymentRequest initiatePaymentRequest = new InitiatePaymentRequest();
        initiatePaymentRequest.setPayment(payment);

        return ((AcknowledgementCodeResponse) getWebServiceTemplate()
                .marshalSendAndReceive(initiatePaymentRequest)).getAcknowledgementcode();
    }
}
