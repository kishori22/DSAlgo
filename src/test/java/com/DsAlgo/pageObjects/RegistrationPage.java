package com.DsAlgo.pageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By getStartedBtn = By.xpath("//a//button[@class='btn']");
	By RegisterButton1 = By.linkText("Register");
	By UserName = By.xpath("//*[@id='id_username']");
	By Password = By.xpath("//input[@type='password'][1]");
	By ConfirmPassword = By.xpath("//input[@type='password'][2]");
	By RegisterButton2 = By.xpath("//input[@type='submit']");
	By SignOutBtn = By.linkText("Sign out");
	
	public void ClickgetStartedBtn() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(getStartedBtn).click();
	}
	
	public void ClickRegisterButton1() {
		driver.findElement(RegisterButton1).click();
	}
	
	public void EnterUserName(String arg1){
		driver.findElement(UserName).sendKeys(arg1);
	}
	
	public void EnterPassword(String arg1) {
		driver.findElement(Password).sendKeys(arg1);
	}
	
	public void EnterConfirmPassword(String arg1) {
		driver.findElement(ConfirmPassword).sendKeys(arg1);
	}
	
	public void ClickRegisterButton2() {
		driver.findElement(RegisterButton2).click();
	}
			
	public void ClickSignOutBtn() {
		driver.findElement(SignOutBtn).click();
	}
}
