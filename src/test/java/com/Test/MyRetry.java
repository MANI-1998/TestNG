package com.Test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {

	int count = 1;
	int limit = 5;
	
	
	
	public boolean retry(ITestResult result) {

		if (count<=limit) { //1<=5 true
			count++;        //2<=5 true
			return true;    //3<=5 true
		}                   //4<=5 true
		                    //5<=5 true
		                    //6<=5 false
		
		return false;
	}

}
