package com.eshop.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eshop.employee.dto.Employee;

public class JdbcDemo {

	public static void main(String[] args) {
	
		// retrieve the employees from table
		try {
			//1. Load the JDBC driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Driver not loaded");
		}
		//2. Define the connection URL.
		String url="jdbc:mysql://localhost:3306/msajcedb";
		String user="root";
		String password="root";
		//3. Establish the connection.
		Connection con=null;
		try {
			 con=DriverManager.getConnection(url, user, password);
			 System.out.println("Connection is established");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4. Create a statement object.
		Statement st=null;
		try {
			 st=con.createStatement();
			 System.out.println("Statement object is created");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//5. Execute a query or update.
		String selectQuery="select * from employee";
		Employee employee=null;
		List<Employee> listOfEmployee=new ArrayList<Employee>();
		ResultSet rs=null;
		try {
			
			 rs=st.executeQuery(selectQuery);
			 System.out.println("Resultset object created and executed successfully");
			while(rs.next()) {
				employee=new Employee();
			 employee.setId(rs.getInt("id"));
			 employee.setEname(rs.getString("ename"));
			 employee.setSalary(rs.getInt("salary"));
			 listOfEmployee.add(employee);
			//6. Process the results.
			for(Employee emp:listOfEmployee) {
				System.out.println(emp.getId() + " " +emp.getEname() + " "+emp.getSalary());
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				//7. Close the connection.
				rs.close();
				System.out.println("resultset object closed succssfully");
				st.close();
				System.out.println("statement object closed succssfully");
				con.close();
				System.out.println("connection closed succssfully");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
		
		
	}

}
