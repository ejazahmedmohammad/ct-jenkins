package com.ct.demo.data;

import org.springframework.web.bind.annotation.RequestBody;

import com.ct.demo.Model.Employee;

public class EmployeeMapper {

	public static EmployeeEntity toEntity( Employee em) {
		EmployeeEntity employee = new EmployeeEntity();
		employee.setId(em.getId());
		employee.setName(em.getName());
		return employee;
	}

}