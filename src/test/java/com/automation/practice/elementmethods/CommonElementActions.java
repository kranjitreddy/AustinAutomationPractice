package com.automation.practice.elementmethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class CommonElementActions {
	
	WebDriver driver;
	
	CommonElementActions(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public String getWindowTitle(WebDriver driver)
	{
		return driver.getTitle();
			
	}
	public Set<String> getWindowHandles(WebDriver driver)
	{
		return driver.getWindowHandles();
	}

}
