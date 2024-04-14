package com.fta.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fta.driver.Driver;
import com.fta.driver.DriverManager;
import com.fta.utils.ReadProperty;

public class BaseTest {
	
	protected BaseTest(){}

	@BeforeMethod
	public void setup()
	{
		Driver.initDriver();
		DriverManager.getDriver().get(ReadProperty.getvalueusinghashmap("url"));
	}

	@AfterMethod
	public void tearDown()
	{
		Driver.quitDriver();
	}

}
