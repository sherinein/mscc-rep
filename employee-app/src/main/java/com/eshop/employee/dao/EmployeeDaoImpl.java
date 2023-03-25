package com.eshop.employee.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eshop.employee.dto.Employee;
import com.eshop.employee.util.MySqlConnection;

public class EmployeeDaoImpl implements EmployeeDao{

	private Connection con;
	
	public EmployeeDaoImpl() {
		super();
		con=MySqlConnection.getConnection();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Statement st=null;
		//5. Execute a query or update.
		String selectQuery="select * from employee";
		Employee employee=null;
		List<Employee> listOfEmployee=new ArrayList<Employee>();
		ResultSet rs=null;
		try {
			st=con.createStatement();
			rs=st.executeQuery(selectQuery);
			 System.out.println("Resultset object created and executed successfully");
			while(rs.next()) {
				employee=new Employee();
			 employee.setId(rs.getInt("id"));
			 employee.setEname(rs.getString("ename"));
			 employee.setSalary(rs.getInt("salary"));
			 listOfEmployee.add(employee);
			}
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listOfEmployee;
	}
	//@Override
	Employee saveNewEmployee(Employee emp) {
		return new Employee();
	}

}
