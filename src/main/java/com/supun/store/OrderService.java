package com.supun.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// @Service
public class OrderService {

    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order service created");
    }

  

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
       
        paymentService.processPayment(100.0);
    }
}
