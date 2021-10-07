package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages="com")
@EnableEurekaClient
public class ManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagerServiceApplication.class, args);
		System.err.println("Manager Service running on 9494 port");
	}
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}

}
