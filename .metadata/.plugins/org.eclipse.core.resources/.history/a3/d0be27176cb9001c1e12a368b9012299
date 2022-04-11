package com.guru.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
WebDriver driver;
public LoginPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(this.driver,this);

}
	@FindBy(linkText="Free Sign Up")
	@CacheLookup
	WebElement textlinkText;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement Email;
	
	@FindBy(id="tp-continue-btn")
	@CacheLookup
	WebElement c;
	
	
	public void signUp()
	{
		textlinkText.click();
	}
	
	public void email(String email)
	{
		Email.sendKeys(email);
	}
	
	public void  c()
	{
		c.click();
	}
	}
