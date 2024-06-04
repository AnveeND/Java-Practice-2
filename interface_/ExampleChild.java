package org.tssm.internship.interface_;

public class ExampleChild implements ExampleI1,ExampleI2,ExampleI3{

	
	@Override
	public void common() {
		System.out.println("This is common method ");
		
	}

	@Override
	public void diff3() {
		System.out.println("This is method of interface 1");
		
	}

	@Override
	public void diff2() {
		System.out.println("This is method of interface 2");
		
	}

	
	@Override
	public void diff1() {
		System.out.println("This is method of interface 3");
		
	}
	
	

}
