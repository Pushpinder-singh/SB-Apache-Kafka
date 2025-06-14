package com.micro.Stock_Service.KafkaConsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.micro.Base_Model.dto.OrderEvent;


@Service
public class OrderConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderConsumer.class);

    //@KafkaListener annotation receives messages/events from the Kafka topic
    @KafkaListener(
            topics = "${spring.kafka.topic.name}"
            ,groupId = "${spring.kafka.consumer.group-id}"
    )
    public void consume(OrderEvent event){
        LOGGER.info(String.format("Order event received in stock service => %s", event.toString()));
        LOGGER.info(String.format("Order event Message => %s", event.getMessage()));
        LOGGER.info(String.format("Order event received Status => %s", event.getStatus()));

        // save the order event into the database
    }
}
