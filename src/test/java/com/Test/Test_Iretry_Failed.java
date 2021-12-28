package com.Test;

import org.testng.annotations.Test;

public class Test_Iretry_Failed {

	@Test
	private void divide() {
		System.out.println(10 / 2);
	}

	@Test(retryAnalyzer = MyRetry.class)
	private void divide2() {
		System.out.println(10 / 0);
	}

}
