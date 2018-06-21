package com.automation.practice.TestScripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.practice.pagelayer.ContactUs;
import com.automation.practice.testbase.TestInitialization;

public class ContactUsPageTestCases extends TestInitialization  {
	
	public static final Logger log = Logger.getLogger(ContactUsPageTestCases.class);
	ContactUs contact;
	
	@BeforeClass
	public void setUp()
	{
		try {
			init();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void chooseDropDownValue() throws InterruptedException
	{
		
		System.out.println("Test ContactUs-1: Started for choosing the drop down");
		contact=new ContactUs(driver);
		contact.clickOnContactUs();
		contact.getDropDownOptions();
		
	
		contact.chooseHeadingOption("Customer service");
		
		Thread.sleep(5000);;
		System.out.println("Test ContactUs-1: Ended for choosing the drop down");
	}
	
	@AfterClass
	public void tearDown()
	{
		closeBrowser();
	}
	

}
