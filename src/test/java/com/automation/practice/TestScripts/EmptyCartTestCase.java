package com.automation.practice.TestScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.practice.pagelayer.HomePage;
import com.automation.practice.testbase.TestInitialization;

public class EmptyCartTestCase extends TestInitialization{
	
	public static final Logger log = Logger.getLogger(EmptyCartTestCase.class);
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
	public void emptyCartCheck()
	{
		home=new HomePage(driver);
		if(home.checkCartItems())
		{
			System.out.println("the Cart is empty");
		}
		
		else
		{
			System.out.println("the Cart is Not Empty");
		}
		
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
		
	}
	

}
