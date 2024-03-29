package com.example.rideshare.repositories;

import com.example.rideshare.gen.Customer;
//import com.example.rideshare.gen.CustomerRequest;
import com.example.rideshare.gen.CustomerIdentifier;
import com.example.rideshare.gen.PaymentHeader;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CustomerRepository {
    private static final Map<String, Customer> customers = new HashMap<>();
    private static final Map<String, PaymentHeader> paymentMediums = new HashMap<>();

    @PostConstruct
    public void initData() {
        Customer customer = new Customer();
        CustomerIdentifier ci = new CustomerIdentifier();
        ci.setId("1");
        customer.setCustomerIdentifier(ci);
        customer.setName("Fuad");
        customer.setAddress("Lalbagh");
        customer.setMobile("0193451124");
        customers.put("1", customer);
    }

    public void createCustomer(Customer customer) {
        CustomerIdentifier ci = new CustomerIdentifier();
        ci.setId("" + customers.size() + 1);
        customer.setCustomerIdentifier(ci);
        customers.put(customer.getCustomerIdentifier().getId(), customer);
    }

    public void updateCustomer(Customer customer) {
        customers.replace(customer.getCustomerIdentifier().getId(), customer);
    }

    public void deleteCustomer(String id) {
        customers.remove(id);
    }

    public PaymentHeader getCustomerPaymentHeader(String id) {
//        PaymentHeader ph = new PaymentHeader();
//        ph.setAccountNumber("12412515");
//        ph.setMedium("Ekash");
//        ph.setAmount("");
//
//        return ph;
        if (!paymentMediums.containsKey(id)) {
            PaymentHeader paymentHeader = new PaymentHeader();
            paymentHeader.setMedium("");
            paymentHeader.setAccountNumber("");
            paymentHeader.setAmount("");
            return paymentHeader;
        }
        return paymentMediums.get(id);
    }

    public void setCustomerPaymentHeader(String id, PaymentHeader paymentHeader) {
        paymentMediums.put(id, paymentHeader);
    }

    public Customer findCustomer(String id) {
        return customers.get(id);
    }
}
