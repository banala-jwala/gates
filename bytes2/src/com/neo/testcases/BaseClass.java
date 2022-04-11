package com.neo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
public String baseURL="https://www.bytes2bots.com/";
public String txtlinkTextHome="Home";
public String txtlinkTextCareers="Careers";
public String txtlinkTextContact="Contact";
public static WebDriver driver;

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
