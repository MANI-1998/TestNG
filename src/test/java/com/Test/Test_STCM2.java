package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_STCM2 {

	public WebDriver driver;
	long start_time ;
	long end_time ;

	@BeforeSuite
	private void browser() {
		start_time = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
	}

	@BeforeTest
	private void url() {
		driver.get("https://www.amazon.in/");
	}

	@Test
	private void giftSection() {
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
	}

	@Test
	private void mobileSection() {
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}

	@AfterTest
	private void urlpage() {
		driver.navigate().back();
	}

	@AfterSuite
	private void quit() {
		driver.quit();
		end_time = System.currentTimeMillis();
		long total_time = end_time - start_time ;
		System.out.println("total time taken : " + total_time);
	}

//	@BeforeSuite
//	private void setProperty() {
//		browserlaunch("chrome");
//	}
//
//	@BeforeTest
//	private void browserinitialize() {
//		maxwindow();
//	}
//
//	@BeforeClass
//	private void url() {
//		urllaunch("http://adactinhotelapp.com/index.php");
//	}
//
//	@BeforeMethod
//	private void login() {
//		driver.findElement(By.id("username")).sendKeys("MANI1998");
//		driver.findElement(By.id("password")).sendKeys("76C4Q1");
//		driver.findElement(By.id("login")).click();
//	}
//
//	@Test
//	private void searchMobile() {
//		driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
//		driver.navigate().back();
//	}
//
//	@Test
//	private void phoneBrand() {
//		browserlaunch("chrome");
//		maxwindow();
//		urllaunch("http://adactinhotelapp.com/index.php");
//	}
//
//	@AfterMethod
//	private void logout() {
//		System.out.println("logout");
//	}
//
//	@AfterClass
//	private void browserClose() {
//		System.out.println("close browser");
//	}
//
//	@AfterTest
//	private void verification() {
//		System.out.println("verify");
//	}
//
//	@AfterSuite
//	private void deleteCookies() {
//		System.out.println("cookies delete");
//	}
}
