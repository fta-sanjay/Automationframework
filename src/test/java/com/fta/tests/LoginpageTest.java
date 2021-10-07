package com.fta.tests;

import org.testng.annotations.Test;

import com.fta.pages.LoginPage;

public final class LoginpageTest extends BaseTest{
	
	private LoginpageTest() {}
	
	@Test
	public void loginLogoutTest()
	{
		LoginPage loginpage=new LoginPage();
		loginpage.Login("sanjaysinghjsg@gmail.com", "Evry@2021");
	}

}
