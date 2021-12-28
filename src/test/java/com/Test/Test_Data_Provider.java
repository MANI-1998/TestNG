package com.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Test_Data_Provider {

	@Test(dataProvider = "my data")
	private void loginDetails(String name, String pass) {

		System.out.println("user name : " + name);
		System.out.println("password : " + pass);

	}

	

	@Test(dataProvider = "dev data")
	private void devDetails(String name, int pass) {

		System.out.println("user name : " + name);
		System.out.println("password : " + pass);

	}
	@DataProvider(name = "my data")
	private Object[][] inputData() {
		return new Object[][] { { "vijay", "7766" }, { "ajith", "9988" }, { "vishal", "5544" } };
	}

	@DataProvider(name = "test data")
	private Object[][] inputData1() {
		return new Object[][] { { "test1", "123" }, { "test2", "456" }, { "test3", "789" } };

	}

	@DataProvider(name = "dev data")
	private Object[][] inputData2() {
		return new Object[][] { { "DEV1", 123 }, { "DEV2", 456 }, { "DEV3", 789 } };
	}
}