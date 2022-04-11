package com.neo.Pageobject;

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
@FindBy(linkText="Home")
@CacheLookup
WebElement txtlinkTextHome;

@FindBy(linkText="Careers")
@CacheLookup
WebElement txtlinkTextCareers;

@FindBy(linkText="Contact")
@CacheLookup
WebElement txtlinkTextContact;

public void ClicklinkTextHome()
{
	txtlinkTextHome.click();
}
public void ClicklinkTextCarees()
{
	txtlinkTextCareers.click();
}
public void ClicklinkTextContact()
{
	txtlinkTextContact.click();
}

}

