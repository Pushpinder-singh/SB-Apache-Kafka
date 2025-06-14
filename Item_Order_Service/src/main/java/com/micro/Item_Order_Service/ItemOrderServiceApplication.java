package com.micro.Item_Order_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"kafka_Producer"})
public class ItemOrderServiceApplication {

	/* Item_order-micro-service acts as a kafka producer*/
	public static void main(String[] args) {
		SpringApplication.run(ItemOrderServiceApplication.class, args);
		System.out.println("Item Order Microservice is up and running at port 8085");
	}

}
