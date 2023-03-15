package com.eshop.employee.dao;

import java.util.List;

import com.eshop.employee.dto.Employee;

public interface EmployeeDao {
	Employee saveEmployee(Employee employee);
	List<Employee> getAllEmployee();
}
