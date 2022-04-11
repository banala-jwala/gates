package com.neo.bank.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import banking3com.neo.bank.pageobject.LoginPage;

public class TestCase extends BaseClass

{
@Test
public void Test()
{
driver.get(baseURL);
logger.info(baseURL);
LoginPage loginPage=new LoginPage(driver);
loginPage.setUsername(username);
logger.info("entered username");
loginPage.setPassword(password);
logger.info("enter password");
loginPage.clickSubmit();
logger.info("submit");
if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	
{
	Assert.assertTrue(true);
	logger.info("test passed" );
}
else
{
	Assert.assertTrue(false);
	logger.info("test fail");
}
}
}


