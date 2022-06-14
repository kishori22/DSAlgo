package com.DsAlgo.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.DsAlgo.pageObjects.RegistrationPage;

public class RegistrationTestCase extends BaseClass {
			
	@Test (priority = 0)
	public void enterUserDetails() throws Exception {
		
		RegistrationPage objRegistrationPage = new RegistrationPage(driver);
		objRegistrationPage.ClickgetStartedBtn();
		objRegistrationPage.ClickRegisterButton1();
		objRegistrationPage.EnterUserName("User27");	
		objRegistrationPage.EnterPassword("java123@");
		objRegistrationPage.EnterConfirmPassword("java123@");
		objRegistrationPage.ClickRegisterButton2();	
		
		if(driver.getPageSource().contains("New Account Created")) {
			Assert.assertTrue(true);
   		    logger.info("Registration test is passed");
   		    objRegistrationPage.ClickSignOutBtn();
		}

	}
	
   @Test (priority = 1)	
   public void enterUserDetailsNegative() throws Exception {
		
		RegistrationPage objRegistrationPage = new RegistrationPage(driver);
		objRegistrationPage.ClickRegisterButton1();
		objRegistrationPage.EnterUserName("User20");	
		objRegistrationPage.EnterPassword("  ");
		objRegistrationPage.EnterConfirmPassword("   ");
		objRegistrationPage.ClickRegisterButton2();	
		
		if(driver.getPageSource().contains("password_mismatch:The two password fields didn’t match.")) {
			Assert.assertTrue(true);
   		    logger.info("Registration test is failed");
   		}

	}
}
