package com.sbi.jdbc.reg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	
	final static String user = "root";
	final static String pass = "hello@123";
	final static String url = "jdbc:mysql://localhost:3306/tssm";
	final static String driver = "com.mysql.cj.jdbc.Driver";
	
	static String insert = "insert into tblEmployee values (101,'Anvee','Pune',20000000)";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pass);
		System.out.println("Connected to database 'tssm'");
		
		Statement st = con.createStatement();
		st.executeUpdate(insert);
		
	}
	
	
	
	
	

}
