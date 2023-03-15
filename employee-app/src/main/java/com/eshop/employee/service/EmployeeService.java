package com.eshop.employee.service;

import java.util.List;

import com.eshop.employee.dto.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	
}
