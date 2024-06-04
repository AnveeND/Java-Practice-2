package com.collegeInternship;

public class Client {
	String name = "Anvee"; //declaration and initialisation 
	int roll=1;
	float percent = 89.8f;
	String department = "Admin";
	short s=123 ;
	
	void add()
	{
		System.out.print("Name is "+name);
	}

	public static void main(String[] args) {

		// System.out.print("Name is "+name); --> variables cannot be accessed without object of class 
		Client obj = new Client();
		System.out.print("Name is "+obj.name);
		
	}

}
