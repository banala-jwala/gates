package com.guru.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
public String baseUrl="https://testproject.io/";
public String email="banalaprajwalag@gamil.com";
public static WebDriver driver;

@BeforeClass
public void setup()
{

System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
        driver=new ChromeDriver();

}
@AfterClass
public void tearDown()
{
	driver.close();
}
}
