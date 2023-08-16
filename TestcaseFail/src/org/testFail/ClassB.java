package org.testFail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {

	@Test
	private void test3() {

		System.out.println("test3 pass");
		Assert.assertTrue(true);
	}

	@Test
	private void test4() {

		System.out.println("test4 pass");
		Assert.assertTrue(true);
	}

}
