package org.tssm.internship.polymorphism;

public class overloading {
	void getData(int a) {
		System.out.println("a = "+a);
	}
	
	void getData(String a) {
		System.out.println("String "+a);
	}
	
	void getData() {
		System.out.println("NULL");
	}
	
	/*int getData(int a) {       -- duplicate method and it is not overloading
		return(a);
	}*/
	
	

}
