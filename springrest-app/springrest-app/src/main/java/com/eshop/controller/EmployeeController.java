package com.eshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.entity.Employee;
import com.eshop.service.EmployeeService;
@RequestMapping("/employees")
@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping
	Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	@GetMapping
	List<Employee> getAllEmployee(){
		return employeeService.getAllEmployee();
	}
}
