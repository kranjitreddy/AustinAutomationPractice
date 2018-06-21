package com.automation.practice.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestInitialization {
	
	public static final Logger log = Logger.getLogger(TestInitialization.class);
	
	public WebDriver driver;
	public File f;
	public static Properties Repository=new Properties();
	public FileInputStream fis;
	
	public TestInitialization()
	{
		initializeLogger();
	}
	
	private static void initializeLogger()
	{
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\test\\resources\\Log4J\\log4j.properties");
	}
	
	public void init() throws IOException
	{
		log.info("========Initial set up started from the Test Initialization========== ");
		loadPropertiesFile();
		selectBrowser(Repository.getProperty("browser"));
		driver.get(Repository.getProperty("url"));
	}
	
	public void loadPropertiesFile() throws IOException
	{
		f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\automation\\practice\\config\\config.properties");
		fis=new FileInputStream(f);
		Repository.load(fis);
		log.info("=====Config Properties file loaded======= ");
		
	}
	
	public WebDriver selectBrowser(String browser)
	{
		log.info("=====Going to Select the browser======= "+browser.toString());
		if(browser.equals("firefox")||browser.equals("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir"+"\\DriverExecutableFiles\\chromedriver.exe"));
			//WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			return driver;
			
			
		}
		else if(browser.equals("chrome")||browser.equals("CHROME"))
		{
			System.out.println("Test");
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\NewChromeDriver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
			
		}
		return null;
		
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
