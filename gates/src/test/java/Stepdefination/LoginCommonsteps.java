package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginCommonsteps 
{
	public WebDriver driver;
	public LoginPage page;
	@Given("user is on loginpage")
	public void userIsOnLoginpage()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		page=new LoginPage(driver);
		driver.get("https://gatesit.ac.in/");
	}

	@Given("user is on HomePage")
	public void userIsOnHomePage() 
	{
		
	    
	}

	@When("user enter Homepage")
	public void userEnterHomepage() {
	    
	}

	@And("click on Homepage")
	public void clickOnHomepage() {
	   
	}

	

	@Then("user navigated to home page")
	public void userNavigatedToHomePage()
	{
	   
	}

	@Then("close browser")
	public void closeBrowser()
	{
		
	}
}
