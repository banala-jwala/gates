package com.neo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
WebDriver driver;
public LoginPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(this.driver,this);
	
}

@FindBy(linkText = "Locations")
WebElement linktxtLocations;

public void ClicklinktxtLocations()
{
	linktxtLocations.click();

}
}

