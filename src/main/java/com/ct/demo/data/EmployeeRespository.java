package com.ct.demo.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ct.demo.Model.Employee;

public interface EmployeeRespository  extends JpaRepository<EmployeeEntity, Long> {

	
}
