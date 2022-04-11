package com.neo.book.testdata;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neo.book.pageobject.LoginPage;

public class TestCases extends BaseClass
{
@Test
public void test()
{
	
	logger.info(baseURL);
	LoginPage loginPage=new LoginPage(driver);
	loginPage.setUsername(username);
	logger.info("Enter username");
	loginPage.setPassword(password);
	logger.info("ENTER PASSSWORD");
	loginPage.clickSubmit();
	logger.info("CLICK ON SUBMIT");
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("facebook login is true");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("FACEBOOKLOGIN IS FALSE");
	}
	
}
}
