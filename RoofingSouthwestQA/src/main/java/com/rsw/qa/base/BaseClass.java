package com.rsw.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rsw.qa.utility.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static Properties pro;
	
	
	public BaseClass() {
		try {

			pro= new Properties();
			FileInputStream io= new FileInputStream("/Users/sushant/eclipse-workspace/RoofingSouthwestQA/src/main/java/com/rsw/qa/config/config.properties");
			try {
				pro.load(io);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
	

	public static void initilization() {
		String browserName= pro.getProperty("browser");
		if(browserName.equals("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(TestUtility.pageLoadTime, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtility.implicityTime, TimeUnit.SECONDS);
			driver.get(pro.getProperty("url"));
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}else {
			System.out.println("No browser is availale");
		}
		
		
	}
	
	public static void waitUntilElemntClicable(WebElement element) {
		
		WebDriverWait wait= new WebDriverWait(driver, 70);
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	

}
