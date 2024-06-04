package org.tssm.internship.interface_;

public class ExampleTest {

	public static void main(String[] args) {
		
		ExampleI1 i1 = new ExampleChild();
		ExampleI2 i2 = new ExampleChild();
		ExampleI3 i3 = new ExampleChild();
		
		i1.diff1();
		i2.diff2();
		i3.diff3();
		
		ExampleChild ec = new ExampleChild();
		ec.common();
		
		i1.common();
		i2.common();
		i3.common();
		
		ExampleI1.demo();//Static method call
		
		

	}

}
