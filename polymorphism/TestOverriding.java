package org.tssm.internship.polymorphism;

public class TestOverriding {

	public static void main(String[] args) {
		
		OverridingChild obj = new OverridingChild();
		obj.demo(); // child demo will run because of polymorphism 
		
		overridingParent p1 = new OverridingChild();   //Reference of parent 
		p1.demo();  //still child demo() is called 

	}

}
