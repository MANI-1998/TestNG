package com.Test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Para {
	
	@Parameters ({"s"})
	@Test(priority = 1)
	private void studentName(@Optional("mani") String s) {
		System.out.println("NAME : " + s);
	}

	@Parameters ({"a"})
	@Test(priority = 2)
	private void studentId(@Optional("1234") int a) {
		System.out.println("ID : " + a);
	}

}
