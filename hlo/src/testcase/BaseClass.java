package testcase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utilites.ReadConfig;


public class BaseClass
{
	ReadConfig readconfig=new ReadConfig();
public String baseurl="https://demo.guru99.com/v4/";
public String username="mngr397461";
public String password="AvAsena";
public static WebDriver driver;
 public static Logger logger;
@BeforeClass
public void setup()
{
	System.setProperty("webdriver.chrome.driver",readconfig.getApplicationChromePath());
	driver=new ChromeDriver();
	logger=logger.getLogger("hlo");
	PropertyConfigurator.configure("log4j.properties");
}

@AfterClass
public void teardown()
{
	driver.quit();
	
}
}
