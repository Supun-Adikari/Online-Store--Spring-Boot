package com.supun.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// @Service("stripe")
// @Primary
public class StripePaymentService implements PaymentService {
    @Value("${stripe.apiurl}")
    private String apiUrl ;

    @Value("${stripe.enabled}")
    private boolean enabled ;

    @Value("${stripe.timeout:3000}")
    private int timeout ;

    @Value("${stripe.supported-currencies}")
    private List<String> supportedCurrencies ;

    @Override
    public void processPayment(double amount) {
        System.out.println("Stripe");
        System.out.println("Amount: " + amount);
        System.out.println("API URL: " + apiUrl);
        System.out.println("Enabled: " + enabled);
        System.out.println("Timeout: " + timeout);  
        System.out.println("Supported Currencies: " + supportedCurrencies);
    }
    
}
