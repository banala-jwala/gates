package com.selenium.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String driverhome=System.getProperty("user.dir");
		String driverPath=driverhome+"//drivers//chromedriver.exe";
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		 driver=new ChromeDriver();
		 String googleURL="https://www.google.co.in/";		
		 driver.get(googleURL);
		 
		 WebElement aboutLink=driver.findElement(By.linkText("about"));
				aboutLink.click();
		 
		 		 Thread.sleep(6000);
		 driver.quit();
		}



	}

