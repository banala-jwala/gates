package testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobject.LoginPage;

public class TestCase extends BaseClass

{
	@Test
	public void test()
	{
		driver.get(baseurl);
		logger.info("url is opened");
		LoginPage src=new LoginPage(driver);
		src.setUsername(username);
		logger.info(username);
		src.setPassword(password);
		logger.info(password);
		src.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
			logger.info("login test passed");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("login test fail");
		}
	}
	
}
