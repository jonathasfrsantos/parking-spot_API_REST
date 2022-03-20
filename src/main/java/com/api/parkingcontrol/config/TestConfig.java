package com.api.parkingcontrol.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.parkingcontrol.repositories.ParkingSpotRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


		@Autowired
		private ParkingSpotRepository repository;

		@Override
		public void run(String... args) throws Exception {
			
			
	
		
	}

}
