package org.tssm.internship.abstractclass;


public class Test {

	public static void main(String[] args) {
		TestDemo td= new TestDemo();//user thinks add is method of TestDemo but actually it is method of Demo 
		
		//Another way :- By reference of abstract class
		Demo d1=new TestDemo();  // user thinks that add is method of demo and is defined in demo but it is defined in TestDemo
								// so by this complexity is hided hence provide abstraction
		d1.add();
		td.add();
		td.sub();

	}

}
