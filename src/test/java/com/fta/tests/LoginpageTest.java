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
		String title=loginpage.Login("sanjaysinghjsg@gmail.com", "Evry@2021").logout().getTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Online Shopping for Men, Women Clothing & Accessories at Bewakoof");
		
		
		//	Assert.assertEquals(accountname, "Hi, sanjay", "Login has not done completly");
		
	}

}
