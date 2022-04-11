package com.neo.bank.testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neo.bank.pageobject.LoginPage;

public class TestCase extends BaseClass
{
	

	@Test
	public void test()
	{
	
		driver.get(baseURL);
		LoginPage loginPage= new LoginPage(driver);
		loginPage.setUsername(username);
		loginPage.setPassword(password);
		loginPage.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
