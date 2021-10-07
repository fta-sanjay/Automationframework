package com.fta.tests;

import java.util.Objects;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fta.driver.DriverManager;
import com.fta.utils.ReadProperty;

public final class HomepageTest extends BaseTest{
	
	private HomepageTest() {}
	
	//Null check
	//title verification
	@Test
	public void test1() 
	{
		
		String title=DriverManager.getDriver().getTitle();
		Assert.assertTrue(Objects.nonNull(title));
		Assert.assertTrue(title.toLowerCase().contains("bewakoof"));
		
		Assert.assertEquals(title, "Online Shopping for Men, Women Clothing & Accessories at Bewakoof");
	}



}
