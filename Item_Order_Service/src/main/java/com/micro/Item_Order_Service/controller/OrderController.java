package com.micro.Item_Order_Service.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.micro.Base_Model.dto.Order;
import com.micro.Base_Model.dto.OrderEvent;
import com.micro.Item_Order_Service.kafkaProducer.OrderProducer;


@RestController
public class OrderController {

	OrderProducer orderProducer;

	@Autowired
  	public OrderController(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
	    }
    
	// created to check service is ready  
	@GetMapping("/")
	String home(){
		return "Welcome !!! Kafka Broker is ready to produce events.";
	}
	
	// Pass Order as payload
	@PostMapping("/orders")
	public String placeOrder(@RequestBody Order order) {

        order.setOrderId(UUID.randomUUID().toString());
		OrderEvent orderEvent = new OrderEvent();
		orderEvent.setStatus("PENDING");
        orderEvent.setMessage("order status is in pending state");
        orderEvent.setOrder(order);

        orderProducer.sendMessage(orderEvent);
        
		return "Thank you for placing the order.";
	}
}
