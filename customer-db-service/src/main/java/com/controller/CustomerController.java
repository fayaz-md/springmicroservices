package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bean.Customer;
import com.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping(value="store",consumes=MediaType.APPLICATION_JSON_VALUE)
	public String storeCustomerDetails(@RequestBody Customer cust)
	{
		return customerService.storeCustomerDetails(cust);
	}
	@DeleteMapping(value="delete/{cid}")
	public String deleteCustomerDetails(@PathVariable("cid") int cid)
	{
		return customerService.deleteCustomerDetails(cid);
	}
	@GetMapping(value="allCustomers",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> storeCustomerDetails()
	{
		return customerService.getAllCustomers();
	}
}
