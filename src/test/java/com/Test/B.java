package com.Test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class B {

	@Test
	private void toy() {
		
		String expected = "dairy";
		String actual = "dairy milk";

		SoftAssert s =new SoftAssert();
		
		s.assertEquals(actual, expected);
		
		System.out.println("done");
		
		s.assertAll();
		
	}

}
