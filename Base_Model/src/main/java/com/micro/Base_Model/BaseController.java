package com.micro.Base_Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

	// just to check the service is up 
	@GetMapping("/home")
	String home() {
		return "Welcome to base Domain.";
	}
}
