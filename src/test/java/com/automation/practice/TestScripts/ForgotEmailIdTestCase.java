package com.automation.practice.TestScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.practice.pagelayer.HomePage;
import com.automation.practice.testbase.TestInitialization;

public class ForgotEmailIdTestCase extends TestInitialization 

{
	
	public static final Logger log = Logger.getLogger(ForgotEmailIdTestCase.class);
	HomePage home;
	
	@BeforeClass
	public void setUp() throws IOException
	{
		init();
		
	}
	
	
	@Test
	public void forgotEmailId()
	{
		
		System.out.println("The forgot Email Id Test Started");
		
		home=new HomePage(driver);
		home.clickOnSignInButton();
		home.clickForgotPasswordLink();
		home.enterExistingUserEmailID("kranjitreddy@gmail.com");
		home.clickToRetrieveEmailId();
		String str=home.getRetrieveSuccessMessage();
		
		Assert.assertEquals(str,"A confirmation email has been sent to your address: kranjitreddy@gmail.com");
		
		
		System.out.println("The Test Completed and success message is "+str);
	}

	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}

}
