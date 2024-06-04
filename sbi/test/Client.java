package com.sbi.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.RepeatedTest;

public class Client {
	
	@RepeatedTest(3)
	public void demo() {
		int result = 50;
		Operation op = new Operation();
		int y=op.add(10, 40);
		assertEquals(result, y);
		
	}

}
