package com.qa.parabank.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.parabank.pages.LoginPage;

public class LoginPageTest extends BaseTest{
	
	
	@Test(priority=1)
	public void verifyLoginPageTitleTest(){
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println("login page title is: "+ title);
		Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
	}
	
	@Test(priority=2)
	public void loginTest(){
		page.getInstance(LoginPage.class).doLogin("automation-bis", "automation");
	}
	

}
