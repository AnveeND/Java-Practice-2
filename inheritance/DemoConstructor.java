package com.college.internship.inheritance;

public class DemoConstructor {
	
	public DemoConstructor() {
		System.out.println("This is Explicit Constructor ");
	}
	
	DemoConstructor(int x){
		System.out.println("This is parameterised constructor "+ x);
	}
	
public static void main(String[] args) {
	DemoConstructor d1=new DemoConstructor();
	DemoConstructor d2=new DemoConstructor(5);
}

}
