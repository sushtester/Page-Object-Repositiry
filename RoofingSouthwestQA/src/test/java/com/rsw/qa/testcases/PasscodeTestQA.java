package com.rsw.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rsw.qa.base.*;
import com.rsw.qa.pages.HomePagePages;
import com.rsw.qa.pages.LoginPage;
import com.rsw.qa.pages.Passcode;



public class PasscodeTestQA extends BaseClass{
	
	LoginPage loginpage;
	Passcode passcodePage;
	HomePagePages homePage;
	
	public PasscodeTestQA() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initilization();
		loginpage= new LoginPage();
		passcodePage= loginpage.clickContinue(pro.getProperty("uname"));
		
	}
	
	@Test (priority= 1)
	public void verifyGetTitlePasscode() {
		
		String passcodeFlag= passcodePage.getPasscodePageTitle();
		Assert.assertEquals(passcodeFlag, "Roofing Southwest");
		
	}
	
	@Test(priority= 2)
	public void verifyEnterPasscode() {
		homePage= passcodePage.addPasscode();
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
		
	}
	
	
	

}
