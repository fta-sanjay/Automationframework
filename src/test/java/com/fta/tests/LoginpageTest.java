package com.fta.tests;

import com.fta.dataprovider.DataProviderWithExcel;
import com.fta.dataprovider.DataProviderWithExcelHashmap;
import com.fta.utils.ExtentReport;
import org.testng.annotations.Test;

import com.fta.pages.LoginPage;

import java.util.HashMap;

public final class LoginpageTest extends BaseTest{

	private LoginpageTest() {}
	
	@Test(dataProvider = "getdatausinghashmap",dataProviderClass = DataProviderWithExcelHashmap.class)
	public void loginLogoutTest(HashMap<String,String> data)
	{
		ExtentReport.extenttest("Login test");
		LoginPage loginpage=new LoginPage();
		//String title=loginpage.Login("sanjaysinghjsg@gmail.com", "Evry@2021").logout().getTitle();
			loginpage.Login(data.get("username"),data.get("password")).logout().getTitle();
//		loginpage.Login(username,password).logout().getTitle();
//		ExtentReport.test.pass("Login to Bewakoof is successful");
//		System.out.println(title);
//		Assert.assertEquals(title, "Online Shopping for Men, Women Clothing & Accessories at Bewakoof");
//		Assert.assertEquals(accountname, "Hi, sanjay", "Login has not done completly");
// new line added by SDET 1
//new line SDET 2

	}

}
