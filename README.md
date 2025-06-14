# Spring Boot-Microservices-Apache-Kafka
In this project demonstrates the concept of Event-Driven Microservices application using Spring Boot and Apache Kafka. ItemOrderService act as a Kafka Producer that sends an Order event to the Kafka Message Broker. StockService and EmailService are the Kafka Consumers, consume's the events from the Message Broker. BaseModel is created for DTO's Order and OrderEvent which are leveraged by both Kafka producers and consumers. 

**Tech Stack & Tools**
- Java 21 & Maven
- Spring Boot 3.5.0
- Apache Kafka 3.9.1
- Postman

**Three Microservices**
- ItemOrderService
- StockService
- EmailService

![image](https://github.com/user-attachments/assets/762ec57e-3c20-4a1a-911f-044ecadb8470)

Verify the logs of producer and consumer microservices as a asynchronous communication.

![image](https://github.com/user-attachments/assets/1e82d250-8feb-49c0-bef3-e092ca9693f0)

