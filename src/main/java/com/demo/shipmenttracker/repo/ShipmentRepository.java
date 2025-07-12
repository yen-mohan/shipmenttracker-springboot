package com.demo.shipmenttracker.repo;

import com.demo.shipmenttracker.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipmentRepository  extends JpaRepository<Shipment, String> {
}
