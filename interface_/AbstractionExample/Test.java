package org.tssm.internship.interface_.AbstractionExample;

public class Test {

	public static void main(String[] args) {
		
		//P1 p1 = new Child();
		//P2 p2 = new Child();
		P3 p3 = new Child();
		p3.demo();  // user thinks demo() is in P3 but actually it is in p1 --> Abstraction 
	

	}

}
