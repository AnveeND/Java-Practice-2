package com.collegeInternship;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbconnection {
	final static String driverString = "com.mysql.cj.jdbc.Driver";
	final static String url="jdbc:mysql://localhost:3306/reg";
	final static String user="root";
	final static String password="hello@12";



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driverString);  // To use driver
		Connection conn=DriverManager.getConnection(url,user,password);
		System.out.println("Connected to database ");



	}

}
