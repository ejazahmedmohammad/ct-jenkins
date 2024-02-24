package com.ct.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ct.demo.Model.Employee;
import com.ct.demo.data.EmployeeEntity;
import com.ct.demo.service.IEmployeeService;

@RestController
public class Hello {
	
	
	private final IEmployeeService employeeService;
	
	public Hello(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
 
	
	
	@PostMapping("/insert")
	public EmployeeEntity insert(@RequestBody Employee  e) {
		return employeeService.insert(e);
		 
	}
	
}
