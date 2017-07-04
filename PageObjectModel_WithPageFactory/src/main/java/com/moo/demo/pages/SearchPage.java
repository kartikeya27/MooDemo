package com.moo.demo.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.moo.demo.base.BasePage;
import com.moo.demo.utility.MooConstants;
import com.relevantcodes.extentreports.ExtentTest;

public class SearchPage extends BasePage {
	
	
	@FindBy(xpath=MooConstants.SEARCH_BOX)
	public WebElement searchBox;
	
	@FindBy(xpath=MooConstants.SEARCH_ENTER)
	public WebElement searchEnter;
	
	

	public SearchPage(WebDriver driver, ExtentTest test) {
		super(driver, test);
	}
	
	public void verifySearch(String searchText) {
		searchBox.sendKeys(searchText);
		searchEnter.sendKeys(Keys.RETURN);
	}
}
