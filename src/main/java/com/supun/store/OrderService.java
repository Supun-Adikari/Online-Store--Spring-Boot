package com.supun.store;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

// @Service
public class OrderService {

    private PaymentService paymentService;
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
        System.out.println("Order service created");
    }

    @PostConstruct
    public void init() {
        System.out.println("Order service initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Order service destroyed");
    }

  

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
       
        paymentService.processPayment(100.0);
    }
}
