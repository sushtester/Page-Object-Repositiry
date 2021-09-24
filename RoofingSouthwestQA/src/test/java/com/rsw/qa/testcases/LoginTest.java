package com.rsw.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rsw.qa.pages.*;


import com.rsw.qa.base.*;

public class LoginTest extends BaseClass{
	
	LoginPage loginpage;
	Passcode passcodePage; 
	
	public LoginTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		
		initilization();
		loginpage= new LoginPage();
	}
	
	@Test (priority=1)
	public void checkTitleLogin() {
		
		
		String title= loginpage.getTitleOfLoginPage();
		Assert.assertEquals(title, "Roofing Southwest");
				
	}
	
	@Test(priority=2)
	public void checklLogoApplication() {
		
		boolean logoFlag= loginpage.logoCheck();
		Assert.assertTrue(logoFlag);
		
	}
	
	@Test (priority=3)
	public void checkContinueButton() {
		passcodePage= loginpage.clickContinue(pro.getProperty("uname"));
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
