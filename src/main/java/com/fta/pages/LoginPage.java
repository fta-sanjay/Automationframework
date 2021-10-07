package com.fta.pages;

import org.openqa.selenium.By;

import com.fta.driver.DriverManager;

public final class LoginPage {
	
	private final By login_link=By.xpath("//a[@id='loginLink']");
	private final By email_button=By.xpath("//button[@id='web_email_login']");
	private final By email_textbox=By.xpath("//input[@id='email_input']");
	private final By password_textbox=By.xpath("//input[@id='mob_password']");
	private final By login_button=By.xpath("//button[@id='mob_login_password_submit']");

	
	public void Login(String username,String password)
	{
		DriverManager.getDriver().findElement(login_link).click();
		DriverManager.getDriver().findElement(email_button).click();
		DriverManager.getDriver().findElement(email_textbox).sendKeys(username);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DriverManager.getDriver().findElement(password_textbox).sendKeys(password);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DriverManager.getDriver().findElement(login_button).click();
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
