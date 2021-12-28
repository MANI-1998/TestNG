package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A {

	@Test
	private void choco() {
		String expected = "dairy";
		String actual = "dairy milk";
		
		Assert.assertEquals(actual, expected);
		System.out.println("done");
	}

	@Test
	private void ice() {
		String expected = "i cone" ;
		String actual = "i cone" ;
		
		Assert.assertEquals(actual, expected);
	}
}
