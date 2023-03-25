package com.eshop.dao;

import java.util.List;

import com.eshop.dto.Employee;

public interface EmployeeDao {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
	Employee getEmployeeById(int id);
	void deleteEmployee(int id);
	Employee updateEmployee(Employee employee, int id);
}
