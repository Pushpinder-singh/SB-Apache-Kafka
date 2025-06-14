package com.micro.Email_Service.kafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.micro.Base_Model.dto.OrderEvent;

@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event){
        LOGGER.info(String.format("Order event received in email service => %s", event.toString()));
        LOGGER.info(String.format("Order event in email service message => %s", event.getMessage()));
        LOGGER.info(String.format("Order event in email service status => %s", event.getStatus()));

        // send an email to the customer
    }
}