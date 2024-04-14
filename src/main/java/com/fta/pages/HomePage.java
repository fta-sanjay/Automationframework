package com.fta.pages;

import java.util.List;
import com.fta.enums.WaitStrategy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.fta.driver.DriverManager;


public final class HomePage extends BasePage{

	public HomePage(){}

	private final By buttonAccount=By.xpath("//*[@id='testHeaderAcc']");
	private final By buttonLogout=By.xpath("//*[text()='Logout']");

	public HomePage logout()
	{
		click(buttonAccount, WaitStrategy.PRESENCE);
		click(buttonLogout,WaitStrategy.PRESENCE);
		return this;
	}
	public String getTitle()
	{
		return DriverManager.getDriver().getTitle();
	}
	
	private final By linkMenu=By.xpath("//*[@id='testMenuSelect-shop-men']/span/span");
	public void getProductPage()
	{
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		new Actions(DriverManager.getDriver()).moveToElement(DriverManager.getDriver().findElement(linkMenu));
		List<WebElement> elements=DriverManager.getDriver().findElements(By.xpath("//a[text()='Topwear' and @href='/top-wear-for-men']/following-sibling::a"));
		for(WebElement e:elements)
		{
			e.click();
			System.out.println(DriverManager.getDriver().getTitle());
		}
		//return DriverManager.getDriver().getTitle();
	}
}
