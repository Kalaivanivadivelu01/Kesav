package org.retryanalyse;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {

	@Test
	private void test1() {

		System.out.println("test1 pass");
		Assert.assertTrue(true);
	}

	@Test
	private void test2() {

		System.out.println("test2 pass");
		Assert.assertTrue(true);
	}

	@Test
	private void test3() {

		System.out.println("test3 pass");
		Assert.assertTrue(false);
	}

	@Test
	private void test4() {

		System.out.println("test4 pass");
		Assert.assertTrue(false);
	}

}
