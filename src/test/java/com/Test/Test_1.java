package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.base.Base;
import com.base.Task1_Pom;

public class Test_1 extends Base {

	Task1_Pom tp1 = new Task1_Pom(driver);

	@Test(invocationCount = 10)
	public void user_pass() throws InterruptedException {
		browserlaunch("chrome");
		maxwindow();
		urllaunch("https://www.facebook.com/");
		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("9943039388");
		WebElement ps = driver.findElement(By.name("pass"));
		ps.sendKeys("12345678");
		driver.findElement(By.name("login")).click();
		sleep(3000);
		quitthebrowser();

	}

}
