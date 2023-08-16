package org.testFail;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassA {
	
@Test
	private void test1() {
		
		System.out.println("test1 pass");
		Assert.assertTrue(false);
	}
	
@Test
private void test2() {
		
		System.out.println("test2 pass");
		Assert.assertTrue(false);
	}
	
	
	
}
