package com.example.rideshare.gen;

public class CustomerPaymentMedium {
    protected String customerId;
    protected PaymentHeader paymentHeader;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public PaymentHeader getPaymentHeader() {
        return paymentHeader;
    }

    public void setPaymentHeader(PaymentHeader paymentHeader) {
        this.paymentHeader = paymentHeader;
    }
}
