package com.neo.testcases;

import org.testng.annotations.Test;

import com.neo.PageObject.LoginPage;

public class TestCase 
{
@Test
public void test(Object drivers)
{
	
	driver.get("baseURL");
	LoginPage loginPage=new LoginPage(drivers);
	loginPage.Username
}

}
