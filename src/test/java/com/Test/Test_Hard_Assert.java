package com.Test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Hard_Assert {

	// validation
	@Test
	private void username() {
		String expected = "John";
		String actual = "Jack";
		Assert.assertEquals(actual, expected);
	}

	@Test
	private void userPassword() {
		String expected = "John";
		String actual = "John";
		Assert.assertEquals(actual, expected);
	}

}
