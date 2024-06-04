package org.tssm.internship.interface_;

public class TestClass {

	public static void main(String[] args) {
		Demo d1=new GrandChild();  //Reference of interface and constructor of grandchild is called user doesnt know where the implementation 
								   // of that method is .
		d1.demoMethod();

	}

}

