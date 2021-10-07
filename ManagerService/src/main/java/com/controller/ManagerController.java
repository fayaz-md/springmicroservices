package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.bean.Customer;

@RestController
public class ManagerController {
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping(value="allCustomers")
	public List<Customer> callCustomerInformation()
	{
		List<Customer> list=restTemplate.getForObject("http://customer-db-service:9393/allCustomers",List.class);
		return list;
	}
}
