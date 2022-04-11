package com.abhi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class abhibus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String driverhome=System.getProperty("user.dir");
		String driverPath=driverhome+"//drivers//chromedriver.exe";

		System.setProperty("webdriver.chrome.driver",driverPath);
		driver=new ChromeDriver();
		String abhibusURL="https://www.abhibus.com/";
		driver.get(abhibusURL);

		String source="Anantapur";
		String destination="gooty";
		String path="train";
		String element="login";


		WebElement transport= driver.findElement(By.id("pills-profile-tab"));
		transport.click();

		WebElement loginPath=driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div[3]/ul/li/div[2]/span"));
		loginPath.click();

		WebElement txtleavingFrom = driver.findElement(By.id("source")) ;
		//WebElement txtleavingFrom1 = driver.findElement(By.id("ui-id-19")) ;

		WebElement txtgoingTo = driver.findElement(By.id("destination"));
		// WebElement txtgoingTo1 = driver.findElement(By.id("ui-id-30"));

		WebElement txtdataofjourney=driver.findElement(By.id("datepicker1"));
		// WebElement popupDate=driver.findElement(By.linkText("8"));
		txtleavingFrom.sendKeys(source);
		//txtleavingFrom1.click();
		txtgoingTo.sendKeys(destination);
		//txtgoingTo1.click();
		txtdataofjourney.click();
		//popupDate.click();

		WebElement search=driver.findElement(By.linkText("Search")); 
		search.click();

		Thread.sleep(6000);
		driver.quit();


	}

}
