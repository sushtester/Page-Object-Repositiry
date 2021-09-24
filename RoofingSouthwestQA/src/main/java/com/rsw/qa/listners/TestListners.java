package com.rsw.qa.listners;




import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.rsw.qa.base.BaseClass;
import com.rsw.qa.utility.TestUtility;

public class TestListners extends BaseClass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Case is getting failed");
		TestUtility.failed();
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
   
	

	


}
