package com.neo.testcases;

import org.testng.annotations.Test;

import com.neo.Pageobject.LoginPage;

public class Testcase extends BaseClass
{
@Test
public void test() 
{
	driver.get(baseURL);
	LoginPage loginPage=new LoginPage(driver);
	loginPage.ClicklinkTextHome();
	loginPage.ClicklinkTextCarees();
	loginPage.ClicklinkTextContact();
	
	
}
}
