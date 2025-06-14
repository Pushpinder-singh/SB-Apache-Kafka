package com.micro.Stock_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StockServiceApplication {

	/* Stock-micro-Service acts as a kafka consumer*/
	public static void main(String[] args) {
		SpringApplication.run(StockServiceApplication.class, args);
		System.out.println("Stock Microservice is Up and running at port 8081");
	}

}
