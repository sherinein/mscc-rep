package com.eshop.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.eshop.dto.Employee;
import com.eshop.service.EmployeeService;
import com.eshop.service.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private EmployeeService employeeService;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        employeeService=new EmployeeServiceImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employee> listOfEmployee=employeeService.getAllEmployee();
		request.setAttribute("employees", listOfEmployee);
		RequestDispatcher dispatcher=request.getRequestDispatcher("display-employee.jsp");
	
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee employee=new Employee();
		employee.setId(Integer.parseInt(request.getParameter("id")));
		employee.setEname(request.getParameter("ename"));
		employee.setSalary(Integer.parseInt(request.getParameter("salary")));
		employeeService.saveEmployee(employee);
		doGet(request, response);
	}

}
