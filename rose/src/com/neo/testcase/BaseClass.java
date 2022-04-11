package com.neo.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
public String baseUrl="https://www.youtube.com/watch?v=ryUxrFUk6MY";
public String baseUrl1="https://en.wikipedia.org/wiki/Bird";
public String baseUrl2="http://windowsapt.blogspot.com/2022/03/best-dedicated-server-hosting-2022.html";
public static WebDriver driver;

@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	
	driver=new ChromeDriver();
	}
@AfterClass
public void tearDown()
{
	driver.quit();
}
}
