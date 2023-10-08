package com.opencart.utilities;

import org.testng.ITestContext;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.opencart.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {
	
	
	public void onTestStart(ITestResult result) {
		logger.info("Testcase execution started :-"+ result.getName());
	}


	public void onTestSuccess(ITestResult result) {
		logger.info("Testcase execution Passed :-"+ result.getName());
	}

	
	public void onTestFailure(ITestResult result) {
		logger.info("Testcase execution failed :-"+ result.getName());
		UtilClass.takeScreenshotOfPage(result.getName());
		logger.info("take screenshot");
	}

	
	public void onTestSkipped(ITestResult result) {
		logger.info("Testcase execution skipped :-"+ result.getName());
		
	
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
	}

}


