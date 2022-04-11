package com.neo.testcase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.neo.pageobject.LoginPage;

public class TestCase extends BaseClass
{
@Test
public void test()
{
	driver.get(url);
	driver.findElement(By.linkText("clickhere")).click();
	System.out.println("Title of Page is:"+driver.getTitle());
	driver.quit();
	LoginPage page=new LoginPage(driver);
	page.ClicklinktxtLocations();
	
}
}
