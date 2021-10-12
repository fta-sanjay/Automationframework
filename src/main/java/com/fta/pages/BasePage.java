package com.fta.pages;

import org.openqa.selenium.By;

import com.fta.driver.DriverManager;

public class BasePage {

	protected void click(By by)
	{
		DriverManager.getDriver().findElement(by).click();
	}
	protected void sendKeys(By by,String text)
	{
		DriverManager.getDriver().findElement(by).sendKeys(text);
	}
}
