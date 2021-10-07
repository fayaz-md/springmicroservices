package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
public class CustomerDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerDbServiceApplication.class, args);
		System.err.println("Customer service running on port 9393");
	}

}
