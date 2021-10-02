package com.fta.tests;

import org.testng.annotations.Test;

import com.fta.driver.DriverManager;
import com.fta.utils.ReadProperty;

public final class HomepageTest extends BaseTest{
	
	private HomepageTest() {}
	@Test
	public void test1() 
	{
		DriverManager.getDriver().get(ReadProperty.getvalueusinghashmap("url"));
	}
//	@Test
//	public void test2()
//	{
//		DriverManager.getDriver().get("https://www.google.com/");
//	}
//
//	@Test
//	public void test3()
//	{
//		DriverManager.getDriver().get("https://www.facebook.com/");
//	}


}
