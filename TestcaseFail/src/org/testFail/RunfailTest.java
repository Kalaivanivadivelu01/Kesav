package org.testFail;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.AfterTest;

public class RunfailTest {

	@AfterTest
	private void runfail() {

		TestNG obj = new TestNG();

		List<String> list = new ArrayList<String>();

		list.add("C:\\Users\\Kalai\\eclipse-workspace\\Abi\\TestcaseFail\\test-output\\Suite\\testng-failed.xml");

		obj.setTestSuites(list);

		obj.run();

	}

}
