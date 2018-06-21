package com.automation.practice.TestScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.practice.pagelayer.HomePage;
import com.automation.practice.testbase.TestInitialization;

public class LogoCheckTestCase extends TestInitialization {
	
	
	public static final Logger log = Logger.getLogger(LogoCheckTestCase.class);
	HomePage home;
	
	@BeforeClass
	public void setup()
	{
		try {
			init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void LogoTest1()
	{
		home=new HomePage(driver);
		System.out.println("the home logo text is .."+home.getLogoText());
	}
	
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
		
	}


}
