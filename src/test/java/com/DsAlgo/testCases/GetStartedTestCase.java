package com.DsAlgo.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DsAlgo.pageObjects.GetStartedPage;

public class GetStartedTestCase extends BaseClass {
					
	@Test
	public void navigateToGetStarted() {
		
		GetStartedPage objGetStartedPage = new GetStartedPage(driver);
		objGetStartedPage.Header();
		objGetStartedPage.clickOnGetStarted();
		if(driver.findElement(By.linkText("Register")).isDisplayed()) {
   		 Assert.assertTrue(true);
   		 logger.info("Clicked on get started");
   		}
  }

}
