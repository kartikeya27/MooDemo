package com.moo.demo.testcases;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.moo.demo.base.BaseTest;
import com.moo.demo.pages.LandingPage;
import com.moo.demo.pages.SearchPage;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class SearchTest extends BaseTest {
	
	@Test
	public void testSearch() {
		test =  extent.startTest("Search Test with business cards");
		test.log(LogStatus.INFO, "Starting search test");
		test.log(LogStatus.INFO, "Opening browser");
		init("Chrome");
		LandingPage landingPage = new LandingPage(driver,test);
		PageFactory.initElements(driver, landingPage);
		SearchPage searchPage = landingPage.gotoSearchPage();
		String searchText = "business cards";
		searchPage.verifySearch(searchText);
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a")); 
		//List<WebElement> all_links = driver.findElements(By.className("gs-title")); 
		System.out.println("Total no of links Available: " + allLinks.size());
		int j = allLinks.size();
		System.out.println("List of links Available: ");
		for(int i=0;i<j;i++)
		{
			if(allLinks.get(i).getAttribute("href").contains("business-cards.html"))
			{
				String link = allLinks.get(i).getAttribute("href");
				System.out.println(link);
			}  
		}
		test.log(LogStatus.PASS, "Search test passed");
		takeScreenShot();
	}
	
	@Test
	public void testSearch1(){
		test =  extent.startTest("Search Test with sdjfnjsdfj");
		test.log(LogStatus.INFO, "Starting search test");
		test.log(LogStatus.INFO, "Opening browser");
		init("Chrome");
		LandingPage landingPage = new LandingPage(driver,test);
		PageFactory.initElements(driver, landingPage);
		SearchPage searchPage = landingPage.gotoSearchPage();
		String searchText = "sdjfnjsdfj";
		searchPage.verifySearch(searchText);
		String Actualresult = driver.findElement(By.xpath("//div[@class='gs-snippet']")).getText();
		String expectedResult = "Sorry we couldn’t find anything. Please check the spelling or alternatively chat to our friendly customer services team using the chat below.";
	    Assert.assertTrue("Sting could not match", Actualresult.equals(expectedResult));
	}
	
	@Test
	public void testSearch2(){
		test =  extent.startTest("Search Test with misspelled");
		test.log(LogStatus.INFO, "Starting search test");
		test.log(LogStatus.INFO, "Opening browser");
		init("Chrome");
		LandingPage landingPage = new LandingPage(driver,test);
		PageFactory.initElements(driver, landingPage);
		SearchPage searchPage = landingPage.gotoSearchPage();
		String searchText = "businnnneesss caaard";
		searchPage.verifySearch(searchText);
		String Actualresult = driver.findElement(By.xpath("//div[@class='gs-spelling']")).getText();
		String expectedResult = "Showing results for business card";
	    Assert.assertTrue("Sting could not match", Actualresult.equals(expectedResult));
	}
	
	@Test
	public void testSearch3(){
		test =  extent.startTest("Search Test with number and special character");
		test.log(LogStatus.INFO, "Starting search test");
		test.log(LogStatus.INFO, "Opening browser");
		init("Chrome");
		LandingPage landingPage = new LandingPage(driver,test);
		PageFactory.initElements(driver, landingPage);
		SearchPage searchPage = landingPage.gotoSearchPage();
		String searchText = "3434343@#@#";
		searchPage.verifySearch(searchText);
		String Actualresult = driver.findElement(By.xpath("//div[@class='gs-snippet']")).getText();
		String expectedResult = "Sorry we couldn’t find anything. Please check the spelling or alternatively chat to our friendly customer services team using the chat below.";
	    Assert.assertTrue("Sting could not match", Actualresult.equals(expectedResult));
	}
	
	
	@AfterMethod
	public void quit(){
		if(extent!=null){
			extent.endTest(test);
			extent.flush();
		}
		if(driver!=null)
			driver.quit();
	}
}
