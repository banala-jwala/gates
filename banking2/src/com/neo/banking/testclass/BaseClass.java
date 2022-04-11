package com.neo.banking.testclass;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public String baseURL="https://demo.guru99.com/v4/";
	public String Username="mngr391553";
	public String Password="sAnanaj";
	public static WebDriver driver;
	
	public static Logger logger;
	@BeforeClass
	
	public void Setup()
	{
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		logger = logger.getLogger("banking2");
		PropertyConfigurator.configure("Log4j.properties");
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	}

