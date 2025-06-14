package com.micro.Email_Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailServiceApplication {

	/* Email-micro-service acts as a kafka consumer*/
	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}

}
