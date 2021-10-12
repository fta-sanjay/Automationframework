package com.fta.pages;

import org.openqa.selenium.By;

import com.fta.driver.DriverManager;

public final class HomePage extends BasePage{

	protected HomePage(){}

	private final By buttonAccount=By.xpath("//*[@id='testHeaderAcc']");
	private final By buttonLogout=By.xpath("//*[text()='Logout']");

	public HomePage logout()
	{
		click(buttonAccount);
		click(buttonLogout);
		return this;
	}
	public String getTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
}
