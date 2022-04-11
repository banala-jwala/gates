package com.navami;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sriram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		String driverHome=System.getProperty("user.dir");
		String driverPath=driverHome+"//drivers//geckodriver.exe";
		System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",driverPath);
		driver =new FirefoxDriver();
		//String NetflixURL="https://www.netflix.com/in/";
String hotstarURL="https://www.hotstar.com/in";
driver.get(hotstarURL);
WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/div/div[2]/div/div[5]/div"));
		//driver.get(NetflixURL);

		//String emailID="Vinayakaganesh@gmail.com";

		//String password="Cuf3462";

		//WebElement signin=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/a"));
		//WebElement txtemailID=driver.findElement(By.id("id_userLoginId"));
		//WebElement txtemailID=driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div/div/div/div/div[2]/div[1]/div[2]/form/div/div/button/span[1]"));
		//WebElement txtPassword=driver.findElement(By.id("id_password"));
		
		//WebElement txtemailID=driver.findElement(By.xpath("//*[@id=\"appMountPoint\"]/div/div[3]/div/div/div[1]/form/div[1]/div/div/label/label"));

		//txtemailID.sendKeys(emailID);

		//txtPassword.sendKeys(password);
		//signin.click();
login.click();

		Thread.sleep(6000);
		driver.quit();

	}

}

