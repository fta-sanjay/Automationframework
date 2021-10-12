package com.fta.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.google.common.util.concurrent.Uninterruptibles;

public final class LoginPage extends BasePage{
	
	private final By linkLogin=By.xpath("//a[@id='loginLink']");
	private final By buttonEmail=By.xpath("//button[@id='web_email_login']");
	private final By textboxEmail=By.xpath("//input[@id='email_input']");
	private final By textboxPassword=By.xpath("//input[@id='mob_password']");
	private final By buttonLogin=By.xpath("//button[@id='mob_login_password_submit']");
	private final By buttonAccount=By.xpath("//*[@id='testHeaderAcc']");
	private final By linkAccountname=By.xpath("//*[@class='myAccountMenu']/li/a");
	
	
	
	public HomePage Login(String username,String password)
	{
		click(linkLogin);
		click(buttonEmail);
		sendKeys(textboxEmail, username);
		
		Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
		
		sendKeys(textboxPassword, password);
		
		Uninterruptibles.sleepUninterruptibly(3,TimeUnit.SECONDS);
		click(buttonLogin);

		Uninterruptibles.sleepUninterruptibly(3, TimeUnit.SECONDS);
		
		click(buttonAccount);
		
	//	return DriverManager.getDriver().findElement(accountname_link).getText();
		return new HomePage();
		
		
	}

}
