package com.DsAlgo.pageObjects;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.DsAlgo.testCases.BaseClass;

public class GetStartedPage extends BaseClass {
	WebDriver driver;
	
	public GetStartedPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By Header = By.xpath("//h1");
	By getStartedBtn = By.xpath("//a//button[@class='btn']");
		
    public void Header() {
       String getheadertext = driver.findElement(Header).getText();
       assertEquals("Preparing for the Interviews",getheadertext);
    }
    
    public void clickOnGetStarted() {
    	driver.findElement(getStartedBtn).click();
    }
}
