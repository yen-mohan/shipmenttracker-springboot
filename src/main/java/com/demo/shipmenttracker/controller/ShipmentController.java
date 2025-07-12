package com.demo.shipmenttracker.controller;

import com.demo.shipmenttracker.model.Shipment;
import com.demo.shipmenttracker.service.ShipmentService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    private final ShipmentService service;

    @Autowired
    public ShipmentController(ShipmentService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Shipment> get(@PathVariable String id){
        return ResponseEntity.ok(service.getShipment(id));
    }

    @PostMapping
    public ResponseEntity<Shipment> create(@RequestBody Shipment shipment){
        return ResponseEntity.ok(service.createShipment(shipment));
    }
}
