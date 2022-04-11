package com.selenium.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class googlenextpage {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		WebDriver driver;
		
	String driverHome=System.getProperty("user.dir");
	String driverPath=driverHome+"//Drivers//geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",driverPath);
	driver=new FirefoxDriver();
	String gmailURL = "\"https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp\"";
	driver.get(gmailURL);
	String firstName="vandana";
	String lastName="sai";
	String 	userName="neojob122";
	String password="neojob@466";
	
	WebElement txtfirstName =driver.findElement(By.id("firstName"));
	WebElement txtlastName =driver.findElement(By.id("lastName"));
	WebElement txtuserName =driver.findElement(By.id("username"));
	WebElement txtpassword= driver.findElement(By.name("Passwd"));
	WebElement txtconfirmPassword =driver.findElement(By.name("ConfirmPasswd"));
	WebElement showPassword = driver.findElement(By.id("i3"));
	WebElement txtNext=driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));
	
	txtfirstName.sendKeys(firstName);
	txtlastName.sendKeys(lastName);
	txtuserName.sendKeys(userName);
	txtpassword.sendKeys(password);
	txtconfirmPassword.sendKeys(password);
	txtNext.click();
	String phoneNumberId="9994456628";
	WebElement txtphoneNumberId =driver.findElement(By.xpath(""));
	txtphoneNumberId.sendKeys(phoneNumberId);
	WebElement txtNext1=driver.findElement(By.xpath(""));
	
	txtNext1.click();
	Thread.sleep(60000);
	driver.quit();
	}


	
	
	
	
	
	
	
	
	
	
	}

}
