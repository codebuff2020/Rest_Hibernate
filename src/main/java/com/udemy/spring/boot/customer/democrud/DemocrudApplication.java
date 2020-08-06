package com.udemy.spring.boot.customer.democrud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class DemocrudApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(DemocrudApplication.class);
		logger.info("Starting the application : DemocrudApplication ");
		SpringApplication.run(DemocrudApplication.class, args);
	}

}
