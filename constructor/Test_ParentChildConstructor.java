package org.tssm.internship.constructor;

public class Test_ParentChildConstructor {

	public static void main(String[] args) {
		
		Child child=new Child(); // calls parent as well as child class constructor 
		Child child2=new Child(23); // calls default constructor of parent class and parametarised constructor of child class
	}

}
