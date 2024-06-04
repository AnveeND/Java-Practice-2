package org.tssm.internship.innerClass;

public class TestDemo {

	public static void main(String[] args) {
		Demo d1=new Demo();
		//d1.Data(); --> cannot access inner class directly .
		
		Demo.Client1 c1=d1.new Client1();
		c1.Data();
		

	}

}
