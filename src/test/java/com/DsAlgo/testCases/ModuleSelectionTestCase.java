package com.DsAlgo.testCases;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DsAlgo.pageObjects.ModulesPage;

public class ModuleSelectionTestCase extends BaseClass {
	
	@Test (priority=0)
	public void selectModuleArray() {
		
		ModulesPage objModulesPage = new ModulesPage(driver);
		objModulesPage.ClickgetStartedBtn();
		objModulesPage.clickSigninBtn();
		objModulesPage.enterUserNameTextBox("User16");
		objModulesPage.enterPasswordTextBox("java123@");
		objModulesPage.clickLoginBtn();
		objModulesPage.clickDropdown();
		objModulesPage.clickArrays();
		
		if(driver.getPageSource().contains("Array")) {
			Assert.assertTrue(true);
   		    logger.info("Array selected from dropdown");
		}
		
		objModulesPage.clickArraysinPyt();
		objModulesPage.clicktryHereinPyt();
			
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print('Arrays in python')");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		objModulesPage.clickRunBtn();
		driver.navigate().back();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		objModulesPage.clickArraysUL();
		if(driver.getPageSource().contains("Arrays Using List")) {
			Assert.assertTrue(true);
   		    logger.info("Arrays using list is clicked");
		}
		objModulesPage.clicktryHereinPyt();
		WebElement codeMirror1 = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine1 = codeMirror1.findElements(By.className("CodeMirror-line")).get(0);
		codeLine1.click();
		WebElement txtbx1 = codeMirror1.findElement(By.cssSelector("textarea"));
		txtbx1.sendKeys("print('Arrays in python')");
		objModulesPage.clickRunBtn();
		driver.navigate().back();
		
		objModulesPage.clickBasicOpinL();
		if(driver.getPageSource().contains("Basic Operations in Lists")) {
			Assert.assertTrue(true);
   		    logger.info("Basic Operations in lists is clicked");
		}
		objModulesPage.clicktryHereinPyt();
		WebElement codeMirror2 = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine2 = codeMirror2.findElements(By.className("CodeMirror-line")).get(0);
		codeLine2.click();
		WebElement txtbx2 = codeMirror2.findElement(By.cssSelector("textarea"));
		txtbx2.sendKeys("print('Arrays in python')");
		objModulesPage.clickRunBtn();
		driver.navigate().back();
		
		objModulesPage.clickAppofArray();
		if(driver.getPageSource().contains("Applications of Array")) {
			Assert.assertTrue(true);
   		    logger.info("Applications of array is clicked");
		}
		objModulesPage.clicktryHereinPyt();
		WebElement codeMirror3 = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine3 = codeMirror3.findElements(By.className("CodeMirror-line")).get(0);
		codeLine3.click();
		WebElement txtbx3 = codeMirror3.findElement(By.cssSelector("textarea"));
		txtbx3.sendKeys("print('Arrays in python')");
		objModulesPage.clickRunBtn();
		driver.navigate().back();
	}
	
	@Test (priority=1)
	public void selectModuleGraph() {
		
		ModulesPage objModulesPage = new ModulesPage(driver);
		objModulesPage.clickDropdown();
		objModulesPage.clickGraph();
		if(driver.getPageSource().contains("Graph")) {
			Assert.assertTrue(true);
   		    logger.info("Graph is selected from dropdown");
		}
		
		objModulesPage.clickGraph1();
		objModulesPage.clicktryHereinPyt();
		WebElement codeMirror = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine = codeMirror.findElements(By.className("CodeMirror-line")).get(0);
		codeLine.click();
		WebElement txtbx = codeMirror.findElement(By.cssSelector("textarea"));
		txtbx.sendKeys("print('Graph in python')");
		objModulesPage.clickRunBtn();
		driver.navigate().back();
		
		objModulesPage.clickGraphRepres();
		objModulesPage.clicktryHereinPyt();
		WebElement codeMirror1 = driver.findElement(By.className("CodeMirror"));
		WebElement codeLine1 = codeMirror1.findElements(By.className("CodeMirror-line")).get(0);
		codeLine1.click();
		WebElement txtbx1 = codeMirror1.findElement(By.cssSelector("textarea"));
		txtbx1.sendKeys("print('Graph in python')");
		objModulesPage.clickRunBtn();
		driver.navigate().back();
		objModulesPage.ClickSignOutBtn();		
  
	}
	
}