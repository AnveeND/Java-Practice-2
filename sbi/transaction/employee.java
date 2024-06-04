package com.sbi.transaction;

import java.util.Scanner;
//Business class 
//main class is employeemanage
public class employee {
	int id;
	String name;
	String city;
	float salary;
	String designation;
	
	void getDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter employee id : ");
		id = sc.nextInt();
		System.out.print("Enter employee name : ");
		name = sc.next();
		System.out.print("Enter employee city : ");
		city=sc.next();
		System.out.print("Enter employee salary : ");
		salary = sc.nextFloat();
		System.out.print("Enter employee designation : ");
		designation=sc.next();
	}
	
	void showDetails() {
		System.out.println("ID : "+id );
		System.out.println("NAME : "+name );
		System.out.println("CITY : "+city );
		System.out.println("SALARY : "+salary );
		System.out.println("DESIGNATION : "+designation );
	}
	
}
