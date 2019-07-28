package com.qa.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver, WebDriverWait wait) 
	{
		super(driver, wait);
	}
	
	//page locators:
	By userName = By.name("username");
	By passWord = By.name("password");
	By loginButton = By.xpath("//input[@type='submit']");

	
	//page actions:
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String username, String pwd)
	{
		doSendKeys(userName, username);
		doSendKeys(passWord, pwd);
		doClick(loginButton);
		
		try 
		{
			Thread.sleep(6000);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
		
}
