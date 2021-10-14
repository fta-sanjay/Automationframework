package com.fta.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.fta.driver.DriverManager;
import com.fta.enums.WaitStrategy;

public class BasePage {

	protected void click(By by,WaitStrategy waitstrategy)
	{
		if(waitstrategy.equals(WaitStrategy.CLICKABLE))
		{
			explicitlyWaitForElementToBeClickable(by);
			DriverManager.getDriver().findElement(by).click();
		}
		if(waitstrategy.equals(WaitStrategy.PRESENCE))
		{
			explicitlyWaitForElementToBePresent(by);
			DriverManager.getDriver().findElement(by).click();
		}

	}
	protected void sendKeys(By by,String text)
	{
		DriverManager.getDriver().findElement(by).sendKeys(text);
	}

	private void explicitlyWaitForElementToBeClickable(By by)
	{
		new WebDriverWait(DriverManager.getDriver(),10).until(ExpectedConditions.elementToBeClickable(by));
	}
	
	private void explicitlyWaitForElementToBePresent(By by)
	{
		new WebDriverWait(DriverManager.getDriver(), 10).until(ExpectedConditions.presenceOfElementLocated(by));
	}
}
