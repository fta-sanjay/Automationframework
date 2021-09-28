package com.fta.tests;

import org.testng.annotations.Test;

import com.fta.driver.Driver;
import com.fta.driver.DriverManager;

public final class HomepageTest extends BaseTest{
	
	private HomepageTest() {}
	@Test
	public void test1()
	{
		DriverManager.getDriver().get("https://www.bewakoof.com/");
	}
	@Test
	public void test2()
	{
		DriverManager.getDriver().get("https://www.google.com/");
	}

	@Test
	public void test3()
	{
		DriverManager.getDriver().get("https://www.facebook.com/");
	}


}
