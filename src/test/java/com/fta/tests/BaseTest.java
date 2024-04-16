package com.fta.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.fta.utils.ExtentReport;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.fta.driver.Driver;
import com.fta.driver.DriverManager;
import com.fta.utils.ReadProperty;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;

public class BaseTest {
	
	protected BaseTest(){};

	@BeforeSuite
	public void beforesuit()
	{
		ExtentReport.getextentreport();
	}
	@AfterSuite
	public void aftersuit() throws IOException {
		ExtentReport.flushreport();
	}
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
