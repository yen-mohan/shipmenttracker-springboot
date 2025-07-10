package com.demo.shipmenttracker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "shipments")
public class Shipment {



    @Id
    private String shipmentId;

    private String source;
    private String destination;
    private String currentMilestone;

    public Shipment() {
    }

    public Shipment(String shipmentId, String source, String destination, String currentMilestone) {
        this.shipmentId = shipmentId;
        this.source = source;
        this.destination = destination;
        this.currentMilestone = currentMilestone;
    }

    public String getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCurrentMilestone() {
        return currentMilestone;
    }

    public void setCurrentMilestone(String currentMilestone) {
        this.currentMilestone = currentMilestone;
    }
}
