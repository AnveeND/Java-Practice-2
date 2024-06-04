package org.tssm.internship.constructor;

public class NewChild extends NewParent{

	public NewChild() {
		super();
		System.out.println("Child class default constructor ");
	}
	public NewChild(int x) {
		super(1);//this() --> if added this here it calls all the constructors  
		System.out.println("Parametarised constructor child class");
		
	}
	

}
