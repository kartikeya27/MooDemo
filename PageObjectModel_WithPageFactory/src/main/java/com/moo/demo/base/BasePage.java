package com.moo.demo.base;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage {
	
	public BasePage(){}
	
	public WebDriver driver;
	public  ExtentTest test;
	
	public BasePage(WebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;
	}
	
	public String verifyTitle(String expectedTitle) { 
		test.log(LogStatus.INFO, "Verifing the title - "+ expectedTitle);
		return "";
	}
	
	public String verifyText(String locator, String expectedText){
		return "";
	}
	
	public boolean isElementPresent(String locator){
		return false;
	}

}
