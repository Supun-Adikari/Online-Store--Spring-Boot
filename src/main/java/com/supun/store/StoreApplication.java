package com.supun.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class StoreApplication {


	public static void main(String[] args) {
		ConfigurableApplicationContext context=  SpringApplication.run(StoreApplication.class, args);
		
		var heavyResource=context.getBean(HeavyResource.class);

		var order=context.getBean(OrderService.class);
		order.placeOrder();


	}

}
