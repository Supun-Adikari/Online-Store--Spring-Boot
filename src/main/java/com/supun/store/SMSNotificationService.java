package com.supun.store;

import org.springframework.stereotype.Service;

@Service("sms")

public class SMSNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        // Logic to send SMS notification
        System.out.println("Sending SMS notification: " + message);
    }
    
}
