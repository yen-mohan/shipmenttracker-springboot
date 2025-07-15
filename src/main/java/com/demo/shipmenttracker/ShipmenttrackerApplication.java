package com.demo.shipmenttracker;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@OpenAPIDefinition(info = @Info(
		title = "Shipment Tracker API",
		version = "1.0",
		description = "API for tracking shipments and milestones"
))
@EnableCaching
@SpringBootApplication
public class ShipmenttrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipmenttrackerApplication.class, args);
	}

	@PostConstruct
	public void logDbConnection() {
		System.out.println("Resolved DB URL: " + System.getenv("DB_URL"));
	}
}
