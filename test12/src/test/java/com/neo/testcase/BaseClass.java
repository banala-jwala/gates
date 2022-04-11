package com.neo.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
public String url="https://degrees.nau.edu/";
public String linktxtLocations="Locations";
public static WebDriver driver;

@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
	driver=new ChromeDriver();
}

  @AfterClass public void tearDown() 
  {
	  driver.quit(); 
  }
 
}
