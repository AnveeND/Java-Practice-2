package org.tssm.internship.constructor;

public class NewParent {

	public NewParent() {
		super();
		System.out.println("Default constructor from parent class");
	}
	
	public NewParent(int x) {
		super(); // this() --> remove super and if used this then it represents the current class default constructor and calls it 
		System.out.println("Parameterised constructor from parent class");
	}
	

}
