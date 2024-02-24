package com.ct.demo.service;

import org.springframework.stereotype.Service;

import com.ct.demo.Model.Employee;
import com.ct.demo.data.EmployeeEntity;
import com.ct.demo.data.EmployeeMapper;
import com.ct.demo.data.EmployeeRespository;

@Service
public class EmployeeService implements IEmployeeService {

	private final EmployeeRespository empRepo ;
	
	
	

	public EmployeeService(EmployeeRespository empRepo) {
		this.empRepo=empRepo;
	}




	public EmployeeEntity insert(Employee e) {
		EmployeeEntity employee = EmployeeMapper.toEntity(e);
		 return empRepo.save(employee);
	}
}
