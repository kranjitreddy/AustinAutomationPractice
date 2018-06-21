package com.automation.practice.TestScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.practice.elementmethods.CommonElementActions;
import com.automation.practice.pagelayer.HomePage;
import com.automation.practice.testbase.TestInitialization;

public class HomePageSignInCases extends TestInitialization
{
	HomePage home;
	
	public static final Logger log = Logger.getLogger(HomePageSignInCases.class);
		
	@BeforeClass
	public void setUp() throws IOException
	{
		init();
		log.info("=======Initialization is done==========");
	}
	
	@Test
	public void  loginTest() throws InterruptedException, IOException
	{	
		log.info("=======LogIn Test Started ==========");
		
		home=new HomePage(driver);
		home.clickOnSignInButton();
		Thread.sleep(5000);
		home.enterExistingUserEmailID("kranjitreddy@gmail.com");
		home.enterPwdExistingUser("krishiv123");
		home.loginButtonClick();
		
		System.out.println("Now I am printing the Title of the current Page"+driver.getTitle());
		
		
		
		log.info("=======LogIn Test Completed ==========");
		
		
			
	}
	
	@AfterClass
	public void quitBrowser()
	{
		closeBrowser();
	}

}
