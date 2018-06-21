package com.automation.practice.pagelayer;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.practice.testbase.TestInitialization;

public class HomePage extends TestInitialization {
	
	 
	public static final Logger log = Logger.getLogger(HomePage.class);
	WebDriver driver;
	 
	// Identifiers of the Home Page Objects 
	
	 
	By signIn=By.xpath("//a[@title='Log in to your customer account']");
	By emailToCreateAnAccount=By.xpath("//*[@id='email_create']");
	By createAnAccountButton=By.xpath("//*[@id='SubmitCreate']/span" );
	By existingUserEmailId=By.xpath("//*[@id='email']");
	By passwordExistingUser=By.xpath("//*[@id='passwd']");
	By forgotLink=By.xpath("//*[@id='login_form']/div/p[1]/a");
	By loginButton=By.xpath("//*[@id='SubmitLogin']/span");
	By retrieveEmailId=By.xpath("//*[@id='form_forgotpassword']/fieldset/p/button/span");
	By retrieveSuccessMessage=By.xpath("//*[@id='center_column']/div/p");
	By headerLogo=By.xpath("//img[@alt='My Store']");
	
	By emptyCart =By.xpath("//*[@id='header']//span[contains(text(),'empty')]");
	//Constructor for the home page to Initialize the driver 
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;

		
	}
	
	
	//WebElement Actions for the Objects in the HomePage 
	
	public boolean checkCartItems()
	{
		try{
		boolean result=driver.findElement(emptyCart).isDisplayed();
		return result;
		}
		catch(Exception e)
		{
			return false;
		}
		
	}
	public boolean checkLogo() {
		try {
			boolean value = driver.findElement(headerLogo).isDisplayed();
			
			return value;
		} catch (Exception e) {
			return false;
		}

	}
	public String getLogoText()
	{
		return driver.findElement(headerLogo).getText();
	}
	
	public String getRetrieveSuccessMessage()
	{
		return driver.findElement(retrieveSuccessMessage).getText();
	}
	
	public void clickOnSignInButton()
	{
		driver.findElement(signIn).click();
	}
	public void enterEmailToCreateAnAccount(String email)
	{
		log.info("========Entering the Email and going to click on .."+emailToCreateAnAccount.toString());
		driver.findElement(emailToCreateAnAccount).sendKeys(email);
	}
	public void clickToCreateAnAccount()
	{
		driver.findElement(createAnAccountButton).click();
	}
	
	public void enterExistingUserEmailID(String email)
	{
		driver.findElement(existingUserEmailId).sendKeys(email);
	}
	public void enterPwdExistingUser(String pwd)
	{
		driver.findElement(passwordExistingUser).sendKeys(pwd);
	}
	
	public void clickForgotPasswordLink()
	{
		driver.findElement(forgotLink).click();
	}
	public void loginButtonClick()
	{
		driver.findElement(loginButton).click();
	}
	
	public void clickToRetrieveEmailId()
	{
		driver.findElement(retrieveEmailId).click();
	}
	
	
	
	
	
	
}
