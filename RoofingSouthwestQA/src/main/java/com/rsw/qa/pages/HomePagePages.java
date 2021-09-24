package com.rsw.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rsw.qa.base.BaseClass;

public class HomePagePages extends BaseClass{
	
	@FindBy(xpath= "//span[@class='home-title'][contains(text(), 'Home')]")
	WebElement homePageTitleText;
	
	@FindBy(xpath= "//span[@id='c']")
	WebElement adminBtn;
	
	@FindBy(xpath= "//a[@id= 'inspections']")
	WebElement inspectionBox;
	
	
	public HomePagePages() {
		PageFactory.initElements(driver, this);
	}
	
	public String getHomePgaeTitle() {
		return driver.getTitle();
	}
	
	public String verifyHomePageTitleName() {
		return homePageTitleText.getText();
	}
	
	public InspectionListPage clickInspectionTab() {
		
		waitUntilElemntClicable(inspectionBox);
		
		
		
		
		
		inspectionBox.click();
		return new InspectionListPage();
	}
	

}

