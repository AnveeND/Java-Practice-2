package org.tssm.internship.polymorphism;

public class OverridingChild extends overridingParent{
	@Override             //annotation to override the method if this is not written then both methods will act like different methods.
	void demo() {
		System.out.println("This is child class method ");
	}

}
