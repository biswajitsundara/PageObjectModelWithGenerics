package com.qa.parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.parabank.pages.HomePage;
import com.qa.parabank.pages.LoginPage;

public class HomePageTest extends BaseTest{
	
	@Test(priority=1)
	public void homePageTitleTest(){
		page.getInstance(LoginPage.class).doLogin("automation-bis", "automation");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println("home page title is: " + title);
		Assert.assertEquals(title, "ParaBank | Accounts Overview");
	}
	
	@Test(priority=2)
	public void verifyHomePageHeaderTest(){
		page.getInstance(LoginPage.class).doLogin("automation-bis", "automation");
		String header = page.getInstance(HomePage.class).getHomePageHeader();
		System.out.println("home page header is: "+ header);
		Assert.assertEquals(header, "Welcome Biswajit Sundara");
	}
	
}
