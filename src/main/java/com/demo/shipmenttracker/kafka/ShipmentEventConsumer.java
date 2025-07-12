package com.demo.shipmenttracker.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ShipmentEventConsumer {

    private static final String TOPIC_NAME = "shipment-topic";
    private static final String GROUP_ID = "shipment-group";

    @KafkaListener(topics = TOPIC_NAME, groupId = GROUP_ID)
    public void consumeShipment(ConsumerRecord<String, String> record){
        System.out.println("📥 Received shipment event from Kafka: " + record.value());
    }
}
