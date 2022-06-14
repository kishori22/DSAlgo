package com.DsAlgo.pageObjects;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ModulesPage {
	WebDriver driver;
	
	public ModulesPage (WebDriver driver) {
		this.driver = driver;
	}
	
	By getStartedBtn = By.xpath("//a//button[@class='btn']");
	By SignInBtn = By.linkText("Sign in");
	By UserNameTextBox = By.xpath("//*[@id='id_username']");
	By PasswordTextBox = By.xpath("//*[@id='id_password']");
	By LoginBtn = By.xpath("//input[@type='submit']");
	By Dropdown = By.xpath("//a[@class='nav-link dropdown-toggle']");
	By selectArrays = By.linkText("Arrays");
	By selectArraysIP = By.linkText("Arrays in Python");
	By tryHereinPyt = By.xpath("//a[@class='btn btn-info']");
	By writePytCode = By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div");
	By clickRunBtn = By.xpath("//button[@type='button']");
	By selectArraysUL = By.linkText("Arrays Using List");
	By selectBasicOpinL = By.linkText("Basic Operations in Lists");
	By selectAppofArray = By.linkText("Applications of Array");
	By selectGraph = By.linkText("Graph");
	By selectGraph1 = By.linkText("Graph");
	By selectGraphRepre = By.linkText("Graph Representations");
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
  
  public void clickDropdown() {
	  driver.findElement(Dropdown).click();
  }
  
  public void clickArrays() {
	  driver.findElement(selectArrays).click();
  }
  
  public void clickArraysinPyt() {
	  driver.findElement(selectArraysIP).click();
  }
  
  public void clicktryHereinPyt() {
	  driver.findElement(tryHereinPyt).click();
  }
  
  public void writePytCode(String arg1) {
	  driver.findElement(writePytCode).sendKeys(arg1);
  }
  
  public void clickRunBtn() {
	  driver.findElement(clickRunBtn).click();
  }
  
  public void clickArraysUL() {
	  driver.findElement(selectArraysUL).click();
  }
  
  public void clickBasicOpinL() {
	  driver.findElement(selectBasicOpinL).click();
  }
  
  public void clickAppofArray() {
	  driver.findElement(selectAppofArray).click();
  }
  
  public void clickGraph() {
	  driver.findElement(selectGraph).click();
  }
  
  public void clickGraph1() {
	  driver.findElement(selectGraph1).click();
  }
  
  public void clickGraphRepres() {
	  driver.findElement(selectGraphRepre).click();
  }
  
  public void ClickSignOutBtn() {
	  driver.findElement(SignOutBtn).click();
  }
  
 }
