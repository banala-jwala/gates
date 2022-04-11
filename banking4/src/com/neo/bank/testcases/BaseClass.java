package com.neo.bank.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
public String baseURL="https://demo.guru99.com/v4/";
public String username="mngr391553";
public String password = "sAnanaj";
public static WebDriver driver;
public static Logger logger;

@BeforeClass
public void set()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
	driver = new ChromeDriver();
}
@AfterClass
public void tearDown()
{
	driver.quit();
}


}
