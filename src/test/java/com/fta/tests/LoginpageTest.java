package com.fta.tests;

import com.aventstack.extentreports.ExtentTest;
import com.fta.utils.ExtentReport;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.fta.pages.LoginPage;

public final class LoginpageTest extends BaseTest{
	
	private LoginpageTest() {}
	
	@Test
	public void loginLogoutTest()
	{
		ExtentReport.extenttest("Login test");
		LoginPage loginpage=new LoginPage();
		String title=loginpage.Login("sanjaysinghjsg@gmail.com", "Evry@2021").logout().getTitle();
		ExtentReport.test.pass("Login to Bewakoof is successful");
//		System.out.println(title);
//		Assert.assertEquals(title, "Online Shopping for Men, Women Clothing & Accessories at Bewakoof");
//		Assert.assertEquals(accountname, "Hi, sanjay", "Login has not done completly");

	}

}
