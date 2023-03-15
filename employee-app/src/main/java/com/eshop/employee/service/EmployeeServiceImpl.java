package com.eshop.employee.service;

import java.util.List;

import com.eshop.employee.dao.EmployeeDao;
import com.eshop.employee.dao.EmployeeDaoImpl;
import com.eshop.employee.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		super();
		employeeDao=new EmployeeDaoImpl();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeDao.getAllEmployee();
	}

}
