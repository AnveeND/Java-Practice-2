package com.collegeInternship;

public class student {
	int id;
	String name;
	String city;
	
	void getData(int id,String nm,String ct) {
		this.id=id;
		name=nm;
		city=ct;
	}
	
	void displayData() {
		System.out.println("ID : "+id);
		System.out.println("NAME : "+name);
		System.out.println("City : "+city);
	}
	


}
