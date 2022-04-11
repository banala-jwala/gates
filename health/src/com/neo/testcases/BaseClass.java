package com.neo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
public String baseURL="https://occovid19.ochealthinfo.com/";
public String Username="";
public String Password="";
public static WebDriver driver;

@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	driver=new ChromeDriver();
}

public void teardown()

{
	driver.quit();
}
}
