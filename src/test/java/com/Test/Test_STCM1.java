package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_STCM1 {

	@BeforeSuite
	private void setProperty() {
		System.out.println("set property");
	}

	@BeforeTest
	private void browserinitialize() {
		System.out.println("chrome");
	}

	@BeforeClass
	private void url() {
		System.out.println("amazon");
	}

	@BeforeMethod
	private void login() {
		System.out.println("login");
	}

	@Test
	private void searchMobile() {
		System.out.println("search mobile");
	}

	@Test
	private void phoneBrand() {
		System.out.println("iphone");
	}

	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}

	@AfterClass
	private void browserClose() {
		System.out.println("close browser");
	}

	@AfterTest
	private void verification() {
		System.out.println("verify");
	}

	@AfterSuite
	private void deleteCookies() {
		System.out.println("cookies delete");
	}
}
