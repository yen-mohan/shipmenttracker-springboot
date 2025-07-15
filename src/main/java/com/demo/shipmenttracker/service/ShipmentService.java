package com.demo.shipmenttracker.service;

import com.demo.shipmenttracker.model.Shipment;
import com.demo.shipmenttracker.repo.ShipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ShipmentService {


    private final ShipmentRepository repo;
    private final KafkaTemplate<String,String> kafka;

    private static final String TOPIC_NAME = "shipment-topic";

    @Autowired
    public ShipmentService(ShipmentRepository repo, KafkaTemplate<String, String> kafka) {
        this.repo = repo;
        this.kafka = kafka;
    }

//    @Cacheable(value = "shipments" , key = "#id")
    public Shipment getShipment(String id){
        System.out.println("🔍 Fetching shipment from DB for ID: " + id);
        return repo.findById(id).orElse(null);
    }

    public Shipment createShipment(Shipment shipment){
        Shipment saved  = repo.save(shipment);
        kafka.send(TOPIC_NAME, "Shipment created:"+ saved.getShipmentId());
        return  saved;
    }
}
