package com.rsw.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.rsw.qa.base.BaseClass;
import com.rsw.qa.pages.HomePagePages;
import com.rsw.qa.pages.InspectionListPage;
import com.rsw.qa.pages.LoginPage;
import com.rsw.qa.pages.Passcode;

public class HomePageTest extends BaseClass{
	
	LoginPage loginPage;
	Passcode passcodePage;
	HomePagePages homePage;
	InspectionListPage inspectionPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		initilization();
		loginPage= new LoginPage();
		passcodePage= loginPage.clickContinue(pro.getProperty("uname"));
		homePage= passcodePage.addPasscode();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitileText() {
		String homepageText= homePage.verifyHomePageTitleName();
		Assert.assertEquals(homepageText, "Home", "Home Page Title is not correct");
		
	}
	
	@Test(priority=2)
	public void verifyInspectionTabClick() {
		inspectionPage= homePage.clickInspectionTab();
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	

}
