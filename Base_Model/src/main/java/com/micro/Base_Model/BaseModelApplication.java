package com.micro.Base_Model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseModelApplication {

	/*
	 * No need to start this service - just created for Order and OrderEvent
	 * which is imported in other microservices thorugh POM.xml*/
	public static void main(String[] args) {
		SpringApplication.run(BaseModelApplication.class, args);
		System.out.println("Base Model Application is running @ 9090");
	}

}
