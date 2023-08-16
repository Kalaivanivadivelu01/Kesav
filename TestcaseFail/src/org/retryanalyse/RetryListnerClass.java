package org.retryanalyse;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryListnerClass implements IAnnotationTransformer {
	
	public void transform(ITestAnnotation annotation,Class tesClass, Constructor testConstructor, Method testMethod) {

		
		annotation.setRetryAnalyzer(Analyser.class);
	}
	

}
