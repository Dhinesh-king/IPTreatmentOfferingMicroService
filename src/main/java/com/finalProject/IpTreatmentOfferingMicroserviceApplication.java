package com.finalProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class IpTreatmentOfferingMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpTreatmentOfferingMicroserviceApplication.class, args);
	}

}
