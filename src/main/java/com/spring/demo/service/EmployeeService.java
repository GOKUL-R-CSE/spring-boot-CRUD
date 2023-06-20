package com.spring.demo.service;

import java.util.List;
//import java.util.Optional;

import com.spring.demo.model.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployee(long id);
	Employee updateEmployee(Employee employee, long id);
	void deleteEmployee(long id);
	
}
