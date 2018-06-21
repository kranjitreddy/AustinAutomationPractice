package com.automation.practice.pagelayer;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.practice.testbase.TestInitialization;

public class ContactUs extends TestInitialization  {
	
	WebDriver driver;
	
	public static final Logger log = Logger.getLogger(ContactUs.class);
	
	
	By subHeading=By.id("id_contact");
	
	By contactUs=By.xpath("//a[@title='Contact Us']");
	
	public ContactUs(WebDriver driver)
	{
		this.driver=driver;
	}
	public void getDropDownOptions()
	{
		Select options=new Select(driver.findElement(subHeading));
		List<WebElement> list=options.getOptions();
		for(WebElement option:list)
		{
			System.out.print("   "+option.getText());
		}
		
	}
	
	public void clickOnContactUs()
	{
		driver.findElement(contactUs).click();
	}
	
	public void chooseHeadingOption(String option)
	{
		
		Select dropdown=new Select(driver.findElement(subHeading));
		List<WebElement> allOptions=dropdown.getOptions();
		
		for(int i=0;i<=allOptions.size();i++)
		{
			if(allOptions.get(i).getText().equals(option))
			{
				allOptions.get(i).click();
				break;
			}
		}
		
	}

}
