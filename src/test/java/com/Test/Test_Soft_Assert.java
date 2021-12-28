package com.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Soft_Assert {

	@Test
	private void username() {
		SoftAssert s = new SoftAssert();
		String expected = "John123" ;
		String actual = "John456" ;
		
		s.assertEquals(actual, expected);
		
		System.out.println("verified");
		
		s.assertAll();
	}

	@Test
	private void userPass() {
		SoftAssert s = new SoftAssert();
		String expected = "John1230" ;
		String actual = "John4560" ;
		
		s.assertEquals(actual, expected);
		
		System.out.println("verified");
		
		s.assertAll();
	}
}
