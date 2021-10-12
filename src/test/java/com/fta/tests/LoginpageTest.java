package com.fta.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fta.pages.LoginPage;

public final class LoginpageTest extends BaseTest{
	
	private LoginpageTest() {}
	
	@Test
	public void loginLogoutTest()
	{
		LoginPage loginpage=new LoginPage();
		String accountname=loginpage.Login("sanjaysinghjsg@gmail.com", "Evry@2021");
		Assert.assertEquals(accountname, "Hi, sanjay", "Login has not done completly");
		
	}

}
