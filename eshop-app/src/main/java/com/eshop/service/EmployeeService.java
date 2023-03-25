package com.eshop.service;

import java.util.List;

import com.eshop.dto.Employee;

public interface EmployeeService {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	void deleteEmployee(int id);
	Employee updateEmployee(Employee employee, int id);
}
