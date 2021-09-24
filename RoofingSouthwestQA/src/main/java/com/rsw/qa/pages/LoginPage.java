package com.rsw.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rsw.qa.base.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath= "//input[@id='txtEmail']")
	WebElement emailField;
	
	@FindBy(xpath= "//img[@class='sliderImg2']")
	WebElement logoLogin;
	
	@FindBy(xpath= "//a[@id= 'continue']")
	WebElement continueBtn;
	
	//initialize the page objects - 
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String getTitleOfLoginPage() {
		
		 return driver.getTitle();
		 
		
	}
	
	public boolean logoCheck() {
		
		return logoLogin.isDisplayed();

	}
	
	
	public Passcode clickContinue(String emailID) {
		emailField.sendKeys(emailID);
		continueBtn.click();
		return new Passcode();
	}
	
	
	



}
