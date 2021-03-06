package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping(value="getEmployeeInfo",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployeeDetails()
	{
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(111,"Rohit",25000));
		list.add(new Employee(112,"Sham",30000));
		list.add(new Employee(113,"Shamita",22000));
		list.add(new Employee(114,"Suman",26000));
		return list;
	}
}
