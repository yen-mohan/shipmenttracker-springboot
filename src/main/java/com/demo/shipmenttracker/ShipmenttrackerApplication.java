package com.demo.shipmenttracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class ShipmenttrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShipmenttrackerApplication.class, args);
	}

}
