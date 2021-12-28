package com.Test;

import org.testng.annotations.Test;

public class Test_Exception {
	
	
	@Test(expectedExceptions = { ArithmeticException.class, NullPointerException.class })
	private void add() {
		System.out.println(10 / 0);
	}

}
