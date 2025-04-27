package com.supun.store;

public class OrderService {
    public void placeOrder() {
       
        System.out.println("Order placed successfully.");
        var paymentService = new StripePaymentService();
        paymentService.processPayment(100.0);
    }
}
