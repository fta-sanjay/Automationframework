package com.fta.driver;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fta.constants.FrameworkConstants;

public final class Driver {
	private Driver() {}

	public static void initDriver()
	{
		if(Objects.isNull(DriverManager.getDriver()))
		{
			System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromedriverpath());
			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().manage().window().maximize();
		}
	}
	public static void quitDriver()
	{
		if(Objects.nonNull(DriverManager.getDriver()))
		{
			DriverManager.getDriver().quit();
			DriverManager.unload();
		}
	}

}
