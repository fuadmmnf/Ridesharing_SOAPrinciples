package com.example.rideshare.gen;

public class CustomerPaymentMedium {
    protected CustomerIdentifier customerIdentifier;
    protected PaymentHeader paymentHeader;

    public CustomerIdentifier getCustomerIdentifier() {
        return customerIdentifier;
    }

    public void setCustomerIdentifier(CustomerIdentifier customerIdentifier) {
        this.customerIdentifier = customerIdentifier;
    }

    public PaymentHeader getPaymentHeader() {
        return paymentHeader;
    }

    public void setPaymentHeader(PaymentHeader paymentHeader) {
        this.paymentHeader = paymentHeader;
    }
}
