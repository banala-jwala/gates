package com.selenium.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver;
		String driverhome=System.getProperty("user.dir");
		String driverPath=driverhome+"//drivers//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		 driver=new ChromeDriver();
		 String gmailURL="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
		
		 driver.get(gmailURL);
    		 String firstName="vandana";
		 String lastName="sai";
		 String username="santoshub555";
		 String password="welcome@456";
		 
		 
		 WebElement txtfirstname=driver.findElement(By.id("firstName"));
		 WebElement txtlastname=driver.findElement(By.id("lastName"));
		 WebElement txtusername=driver.findElement(By.id("username"));
		 WebElement txtpassword=driver.findElement(By.name("Passwd"));
		 WebElement txtconfirmpassword=driver.findElement(By.name("ConfirmPasswd"));
		 WebElement showPassword=driver.findElement(By.id("i3"));
		 WebElement nextpage=driver.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span"));

		 txtfirstname.sendKeys(firstName);
		 txtlastname.sendKeys(lastName);
		 txtusername.sendKeys(username);
		 txtpassword.sendKeys(password);
		 txtconfirmpassword.sendKeys(password);
		 showPassword.click();
		 nextpage.click();
		 	 
		 Thread.sleep(6000);
		 driver.quit();
		}


}
