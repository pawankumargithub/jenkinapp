package com.demo.service;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.entity.Employee;

@Service
public class EmployeeService {
	
	
	public List<Employee> allEmployees(){
		
		return Arrays.asList(new Employee(1,"pawan"),new Employee(2,"himan"),new Employee(3,"raj"),new Employee(4,"khusi"));
	}

}
