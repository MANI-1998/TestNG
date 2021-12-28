package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Rev {

	public WebDriver driver;
	long start ;
	long end;
	
	//mobile section click
	//electronics section click
	
	@BeforeSuite
	private void browser() {
		start = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\S.R\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@BeforeTest
	private void url() {
		driver.get("https://www.amazon.in/");

	}
	
	@Test
	private void mobile() {
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
	}
	
	@Test
	private void giftSection() {
		driver.findElement(By.xpath("//a[text()='Gift Cards']")).click();
	}
	
	@AfterTest
	private void back() {
		driver.navigate().back();

	}
	
	@AfterSuite
	private void quit() {
		System.out.println("verification done");
		end = System.currentTimeMillis();
		long total = end - start ;
		
		System.out.println("total time taken : " + total);
		//driver.quit();

	}
	
	
	
	
	
	
	
}
