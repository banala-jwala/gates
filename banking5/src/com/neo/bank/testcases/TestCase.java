package com.neo.bank.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neo.bank.pageobject.LoginPage;

public class TestCase extends BankClass
{
@Test
public void test()
{
	
	logger.info(baseURL);
	LoginPage loginPage=new LoginPage(driver);
	loginPage.setUsername(username);
	logger.info("Enter username");
	loginPage.setPassword(password);
	logger.info("Enter password");
	loginPage.clickSubmit();
	logger.info("click on submit button");
	if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	{
		Assert.assertTrue(true);
		logger.info("project is successfully completed");
	}
	else
	{
		Assert.assertTrue(false);
		logger.info("project is notsuccessfully completed");
	}
}
	  
}
  
