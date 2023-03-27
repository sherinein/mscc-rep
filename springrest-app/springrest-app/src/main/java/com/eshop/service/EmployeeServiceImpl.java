package com.eshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.entity.Employee;
import com.eshop.respository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
	
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		
		Optional<Employee> optionalContainer=employeeRepository.findById(id);
		
		return optionalContainer.get();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Employee updateEmployee(Employee employee, int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
