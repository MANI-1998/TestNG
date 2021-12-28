package com.Test;

import org.testng.annotations.Test;

public class Test_Timeout {
	
	@Test(timeOut = 5000)
	private void data() throws InterruptedException {
		System.out.println("start");
		//Thread.sleep(2000);
		System.out.println("end");
	}

}
