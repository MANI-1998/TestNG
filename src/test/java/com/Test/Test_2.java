package com.Test;

import org.junit.Ignore;
import org.testng.annotations.Test;

public class Test_2 {

	@Test
	private void data() {
		System.out.println("test");
	}

	@Test(invocationCount = 3)
	private void student_Data() {
		System.out.println("test data of the student");
	}

	@Ignore
	private void teacher_Data() {
		System.out.println("test data of the teacher");
	}

	// @Test (enabled = true) is default
	@Test(enabled = false)
	private void worker() {
		System.out.println("data of the worker");
	}

	@Test(dependsOnMethods = "student_Data")
	private void parentsData() {
		System.out.println("students parent details");
	}

}
