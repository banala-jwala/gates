package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCommonSteps 
{
	public WebDriver driver;
	public LoginPage page;
	@Given("user is on login page")
	public void userIsOnLoginPage() 
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		page=new LoginPage(driver);
		driver.get("https://demo.guru99.com/v4/");
	     
	}

	@When("user enters email and password")
	public void userEntersEmailAndPassword()
	{
		page.setUsername("mngr397461");
		page.setPassword("AvAsena"); 
	}

	@When("clicks on login button")
	public void clicksOnLoginButton()
	{
	    page.clickSubmit();
	}

	@Then("user navigated to home page")
	public void userNavigatedToHomePage()
	{
		 if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		   {
			   Assert.assertTrue(true);
		   }
		   else
		   {
			   Assert.assertTrue(false);
		   }
	}

	@Then("close browser")
	public void closeBrowser() 
	{
	    driver.quit();
	}


}
