package org.tssm.internship.interface_.AbstractionExample;

public class Child implements P1,P2,P3{

	@Override
	public void demo3() {
		System.out.println("Method of P3");
		
	}

	@Override
	public void demo2() {
		System.out.println("Method of P2");
		
	}

	@Override
	public void demo() {
		System.out.println("Method of P1");
		
	}
	

}
