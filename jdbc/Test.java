package com.tssm.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;



public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		
		File f1=new File("E:\\Anvee\\collegeInternship\\src\\com\\tssm\\jdbc\\db.properties");
		FileInputStream f2=new FileInputStream(f1);
		Properties p1=new Properties();  // collection - kind of framework -- try to store and read data in key-value pairs
		p1.load(f2);
		
		String user=p1.getProperty("user");
		String driver=p1.getProperty("driver");
		String pass=p1.getProperty("pass");
		String url=p1.getProperty("url");
		
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url,user,pass);
		System.out.println("Connected to the database");
		
		String insert="insert into tblstudent(id,name,city,pass) values(?,?,?,?)";
		
		PreparedStatement pt =con.prepareStatement(insert);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter id : ");
		int id=sc.nextInt();
		
		System.out.println("Enter name : ");
		String n1=sc.next();
		
		System.out.println("Enter city : ");
		String c1=sc.next();
		
		System.out.println("Enter pin : ");
		int p11=sc.nextInt();
		
		pt.setInt(1,id);
		pt.setString(2,n1);
		pt.setString(3, c1);
		pt.setInt(4,p11);
		pt.executeUpdate();
		System.out.println("Data Inserted");
	}

}
