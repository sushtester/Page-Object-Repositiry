package com.rsw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rsw.qa.base.BaseClass;

public class Passcode extends BaseClass{
	
	@FindBy(xpath= "//input[@srno='1']")
	WebElement passcodeField;
	
	
	public Passcode() {
		PageFactory.initElements(driver, this);
		
	}
	
	public String getPasscodePageTitle() {
		return driver.getTitle();
	}
	
	public HomePagePages addPasscode() {
		
		passcodeField.sendKeys(pro.getProperty("pwd"));
		return new HomePagePages();
		
	}
	

}
