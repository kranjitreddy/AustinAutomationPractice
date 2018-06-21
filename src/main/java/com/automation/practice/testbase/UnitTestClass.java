package com.automation.practice.testbase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class UnitTestClass {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\NewChromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		WebElement wMenu=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));
		
		WebElement tops=driver.findElement(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li[1]/a"));
		
		List<WebElement> list=driver.findElements(By.xpath("//*[@id='block_top_menu']/ul/li[1]/ul/li"));
		
		
		for(WebElement ele:list)
		{
			System.out.println(ele.getTagName());
		}
		//Actions action=new Actions(driver);
		
		//action.moveToElement(wMenu).build().perform();
		Thread.sleep(2000);
		//action.click(tops).build().perform();
		
		
		
		//JavascriptExecutor executor = (JavascriptExecutor)driver;
		//executor.executeScript("arguments[0].click();",tops);
		
		
		
		System.out.println(driver.getTitle());
		
		driver.close();
	
		
	

	}

}
