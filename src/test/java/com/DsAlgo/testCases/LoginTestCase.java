package com.DsAlgo.testCases;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.DsAlgo.pageObjects.LoginPage;
import com.DsAlgo.utilities.XLUtility;

public class LoginTestCase extends BaseClass {
     	                
     @Test(dataProvider="LoginData")
     public void LoginTest(String username, String password) throws IOException {
    	 
    	 logger.info("URL is opened");
    	 driver.get("https://dsportalapp.herokuapp.com/home");
    	 LoginPage objLoginPage = new LoginPage(driver);
    	 objLoginPage.clickSigninBtn();
    	 objLoginPage.enterUserNameTextBox(username);
    	 objLoginPage.enterPasswordTextBox(password);
    	 objLoginPage.clickLoginBtn();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 	 			    	 
    	 try {
    		 if(driver.findElement(By.linkText("Sign out")).isDisplayed()) {
        		 Assert.assertTrue(true);
        		 logger.info("Login test is passed");
        		 objLoginPage.ClickSignOutBtn();
        	 }
		} catch (Exception e) {
			     captureScreen(driver,"LoginTest");
	    		 logger.info("Login test is failed");
	    	 }
		}
           	    	 
     @DataProvider(name="LoginData")
     public Object [][] getData() throws IOException{
    	 String path = ".\\loginData\\loginData.xlsx";
    	 XLUtility xlutil = new XLUtility(path);
    	 
    	 int totalrows = xlutil.getRowCount("Sheet1");
    	 int totalcols = xlutil.getCellCount("Sheet1", 1);
    	 
    	 Object loginData[][] = new Object[totalrows][totalcols];
    	 
    	 for(int i=1;i<=totalrows;i++)
    	 {
    		 for(int j=0;j<totalcols;j++) {
    			 loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
    		}
    	 }
    	 
    	 return loginData;
    	 
     }
     
   }
