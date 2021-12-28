package com.Test;

import org.testng.annotations.Test;

public class Test_Group {
	
	@Test(groups = "RED")
	private void red1() {
		System.out.println("red1");

	}

	@Test(groups = "RED")
	private void red2() {
		System.out.println("red2");
	}

	@Test(groups = "BLUE")
	private void blue1() {
		System.out.println("blue1");
	}

	@Test(groups = "BLUE")
	private void blue2() {
		System.out.println("blue2");
	}

	@Test(groups = "BLACK")
	private void black1() {
		System.out.println("black1");

	}

	@Test(groups = "BLACK",invocationCount = 3)
	private void black2() {
		System.out.println("black2");

	}
}
