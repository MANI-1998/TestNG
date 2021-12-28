package com.Test;

import org.junit.Ignore;
import org.testng.annotations.Test;

import com.base.Base;

public class Test_3 extends Base {

	@Test (priority = 1)
	private void supermarket() {
		System.out.println("velachery branch");
	}

	@Test(priority = 4 , invocationCount = 3)
	
	private void biscut() {
		System.out.println("milk bikis cream");
	}

	@Test (priority = 3)
	private void vegetable() {
		System.out.println("tomato");
	}

	@Test(priority = 2)
	private void fruits() {
		System.out.println("mango");
	}

}
