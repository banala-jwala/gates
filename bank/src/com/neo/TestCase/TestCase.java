package com.neo.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neo.PageObject.LoginPage;

public class TestCase extends BaseClass 
{
	@Test
	public void test()
	{
		
		driver.get(baseURL);
         logger.info("baseURL");
		
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUsername(username);
		logger.info("enter username");
		
		loginPage.setPassword(password);
		logger.info("enter password");

		
		loginPage.clickSubmit();
		logger.info("click submit button");

		{
			if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
			{
				Assert.assertTrue(true);
				logger.info("login test statement passed");
			
			}
			else
			{
				Assert.assertTrue(false);
				logger.info("login test statement fail");
	
			}
		}
		
	}
	
}
