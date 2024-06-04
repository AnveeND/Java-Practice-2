package com.collegeInternship;

public class TestStatic {
	static {     // No need of calling for static -->executed before main method 
		System.out.println("This is static block");
		
	}
	{
		System.out.println("This is non static block "); // this block is executed whenever object is created 
	}

}
