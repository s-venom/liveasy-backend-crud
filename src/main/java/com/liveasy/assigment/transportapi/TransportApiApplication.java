package com.liveasy.assigment.transportapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@SpringBootApplication
public class TransportApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransportApiApplication.class, args);
	}

}
