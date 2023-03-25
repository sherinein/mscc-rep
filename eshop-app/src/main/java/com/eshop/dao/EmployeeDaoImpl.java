package com.eshop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eshop.dto.Employee;
import com.eshop.util.MySqlConnection;

public class EmployeeDaoImpl implements EmployeeDao {
	private Connection con;
	
	public EmployeeDaoImpl() {
		super();
		con=MySqlConnection.getConnection();
	}

	public Employee saveEmployee(Employee employee) {
		String insertQuery="insert into employee values(?,?,?)";
		PreparedStatement ps=null;
		try {
			ps=con.prepareStatement(insertQuery);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getEname());
			ps.setInt(3, employee.getSalary());
			ps.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return employee;
	}

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
