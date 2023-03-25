package com.eshop.service;

import java.util.List;

import com.eshop.dao.EmployeeDao;
import com.eshop.dao.EmployeeDaoImpl;
import com.eshop.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		super();
		employeeDao=new EmployeeDaoImpl();
	}

	public Employee saveEmployee(Employee employee) {
		// No logic
		return employeeDao.saveEmployee(employee);
	}

	public List<Employee> getAllEmployee() {
	// business logic
		
		return employeeDao.getAllEmployee();
	}

	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	public Employee updateEmployee(Employee employee, int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
