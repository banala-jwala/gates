package com.neo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass
{
public String url="https://www.google.com/search?q=google&rlz=1C1JJTC_enIN995IN995&oq=google&aqs=chrome..69i57.3040j0j7&sourceid=chrome&ie=UTF-8";
public String txtlinktextHome="Home";
public String txtlinkAboutGates="menu-item-746";
public String txtlinkHistory="History";
public String txtlinkAdmissions="menu-item-750";
public String txtlinkacademics="menu-item-751";
public String txtlinkdepartments="menu-item-752";
public String txtlinkcampuslife="menu-item-753";



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
		  driver.quit(); 
		  }
	 
}
