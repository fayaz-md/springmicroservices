package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Customer;
import com.dao.CustomerDao;

@Service
public class CustomerService {
	@Autowired
	CustomerDao customerDao;
	public String storeCustomerDetails(Customer cust)
	{
		if(customerDao.existsById(cust.getCid()))
			return "Record didn't store. Already exist";
		if(customerDao.save(cust)==null)
			return "Customer record didn't store. Try Again !!!!";
		return "Customer record stored successfully";
	}
	public String deleteCustomerDetails(int cid)
	{
		if(!customerDao.existsById(cid))
			return "Record doesn't exists";
		customerDao.deleteById(cid);
		return "Customer record deleetd successfully"; 
	}
	public List<Customer> getAllCustomers()
	{
		return customerDao.findAll();
	}
}
