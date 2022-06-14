package com.DsAlgo.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 public class LoginPage {
     WebDriver driver;
	
	 public LoginPage (WebDriver driver) {
		this.driver = driver;
	}
  
  By getStartedBtn = By.xpath("//a//button[@class='btn']");
  By SignInBtn = By.linkText("Sign in");
  By UserNameTextBox = By.xpath("//*[@id='id_username']");
  By PasswordTextBox = By.xpath("//*[@id='id_password']");
  By LoginBtn = By.xpath("//input[@type='submit']");
  By SignOutBtn = By.linkText("Sign out");
  
  public void ClickgetStartedBtn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(getStartedBtn).click();
	}
  
  public void clickSigninBtn() {
	  	driver.findElement(SignInBtn).click();
  }
  
  public void enterUserNameTextBox(String arg1) {
	  	driver.findElement(UserNameTextBox).sendKeys(arg1);
  }
  
  public void enterPasswordTextBox(String arg1) {
	  	driver.findElement(PasswordTextBox).sendKeys(arg1);
  }
  
  public void clickLoginBtn() {
	  	driver.findElement(LoginBtn).click();
  }
  
  public void ClickSignOutBtn() {
	  	driver.findElement(SignOutBtn).click();
  }
}
