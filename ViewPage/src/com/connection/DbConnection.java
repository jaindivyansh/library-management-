package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	static Connection c;
	
	public static Connection getConnect() {
		String url="jdbc:mysql://localhost:3306/LibraryManagement";
		String username="root";
		String password="root";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection(url, username, password);
			System.out.println("connected");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
	}
	
	public static void closeConnection(){
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
