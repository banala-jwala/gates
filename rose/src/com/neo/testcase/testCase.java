package com.neo.testcase;

import org.testng.annotations.Test;

import com.neo.PageObject.LoginPage;

public class testCase extends BaseClass
{
@Test 
public void test() throws InterruptedException
{
	driver.get(baseUrl1);
	Thread.sleep(4000);
	driver.get(baseUrl2);
	driver.get(baseUrl);
	
	LoginPage lp=new LoginPage(driver);
	
	lp.button();
	lp.button1();
	Thread.sleep(4000);
	lp.button2();
	Thread.sleep(6000);
	lp.button3();
	Thread.sleep(800000 );
 	Thread.sleep(5000);
	driver.manage().window().maximize();
	Thread.sleep(7000);
	
}

}

