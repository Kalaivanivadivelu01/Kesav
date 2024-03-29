package org.retryanalyse;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Analyser implements IRetryAnalyzer {

	int count = 0;
	int maxcount = 2;

	public boolean retry(ITestResult result) {

		if (count < maxcount) {

			System.out.println("retrying" + result.getName() + "again and count is" + (count + 1));
			count++;
			return true;

		}
		return false;
	}

}
