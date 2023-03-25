package com.eshop.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection {

	public static Connection getConnection(){
		Connection con=null;
		try {
		//1. Load the JDBC driver.
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		//2. Define the connection URL.
				String url="jdbc:mysql://localhost:3306/msajcedb";
				String user="root";
				String password="root";
		//3. Establish the connection.
				con=DriverManager.getConnection(url, user, password);
				 System.out.println("Connection is established");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
}
