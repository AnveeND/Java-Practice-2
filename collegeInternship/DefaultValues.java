package com.collegeInternship;

public class DefaultValues {
	String string;
	boolean b;
	short s;
	float f;
	byte b1;
	double d;
	int i;
	char c;
	long l;
	

	public static void main(String[] args) {
		DefaultValues x = new DefaultValues();
		System.out.println(x.string); //null
		System.out.println(x.b); //false
		System.out.println(x.s); //0
		System.out.println(x.f); //0.0
		System.out.println(x.b1); //0
		System.out.println(x.d); //0.0
		System.out.println(x.i); //0
		System.out.println(x.c); // 
		System.out.println(x.l); //0
		
	}

}

