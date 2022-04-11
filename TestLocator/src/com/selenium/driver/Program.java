package com.selenium.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program {

	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver;
	String driverHome=System.getProperty("user.dir");
	String driverPath=driverHome+"//drivers//geckodriver.exe";
	System.getProperty("user.dir");
	System.setProperty("webdriver.gecko.driver",driverPath);
	 driver =new FirefoxDriver();
	 String NaukriURL="https://www.naukri.com/registration/createAccount";
	 
	 
	 driver.get(NaukriURL);
	 String firstName="sri";
	 String emailID="Vinayakaganesh@gmail.com";
	 String mobileNumber="9996677323";
	 String password="Cuf3462";
	 
WebElement txtfirstName=driver.findElement(By.id("name"));
WebElement txtemailID=driver.findElement(By.id("email"));
WebElement txtmobileNumber=driver.findElement(By.id("mobile"));
WebElement txtPassword=driver.findElement(By.id("password"));


txtfirstName.sendKeys(firstName);
txtemailID.sendKeys(emailID);
txtmobileNumber.sendKeys(mobileNumber);
txtPassword.sendKeys(password);
	 
	 Thread.sleep(6000);
	 driver.quit();
	 
	}
}
