package com.eshop.employee;

import java.util.List;

import com.eshop.employee.dto.Employee;
import com.eshop.employee.service.EmployeeService;
import com.eshop.employee.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeService service=new EmployeeServiceImpl();
        List<Employee> listOfEmployee=service.getAllEmployee();
      //6. Process the results.
		for(Employee emp:listOfEmployee) {
			System.out.println(emp.getId() + " " +emp.getEname() + " "+emp.getSalary());
			}
		}
        
}

