package com.qa.parabank.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	
	//page locators:
	By header = By.className("smallText");
	
	//page actions:
	public String getHomePageTitle(){
		return driver.getTitle();
	}
	
	public String getHomePageHeader(){
		return doGetText(header);
	}
	
	
	

}
