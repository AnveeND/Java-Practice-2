package com.collegetssm.internship;
//Business class
//Encapsulation Example -> private variable, methods, static blocks , non-static blocks , constructors are present in single class  
public class demo {
	private int id;
	private String name;
	private String city;
	private String designation;
	private float salary;
	
	void getData(int id,String name,String city,String designation,float salary) {
		this.id=id;
		this.name=name;
		this.city=city;
		this.designation=designation;
		this.salary=salary;
		
		
	}
	
	void showData()
	{
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("CITY : "+city);
		System.out.println("DESIGNATION : "+designation);
		System.out.println("SALARY : "+salary);
	}

}
