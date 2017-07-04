package com.moo.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.moo.demo.base.BasePage;
import com.moo.demo.utility.MooConstants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class LandingPage extends BasePage {
	
	
	public LandingPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public SearchPage gotoSearchPage() {
		test.log(LogStatus.INFO, "Opening the url - "+ MooConstants.HOMEPAGE_URL);
		driver.get(MooConstants.HOMEPAGE_URL);
		test.log(LogStatus.PASS, "URL opened - "+ MooConstants.HOMEPAGE_URL);
		SearchPage searchPage = new SearchPage(driver, test);
		PageFactory.initElements(driver, searchPage);
		return searchPage;
	}
}
