package com.neo.PageObject;

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

@FindBy(xpath="//button[@class='ytp-play-button ytp-button']")
@CacheLookup
WebElement button;

@FindBy(xpath="//button[@class='ytp-fullscreen-button ytp-button']")
@CacheLookup
WebElement button1;

@FindBy(id="ad-text:6")
@CacheLookup
WebElement button2;

@FindBy(xpath="//button[@class='ytp-subtitles-button ytp-button']")
@CacheLookup
WebElement button3;

@FindBy(xpath="//button[@class='ytp-button ytp-settings-button']")
@CacheLookup
WebElement button4;

public void button()
{
	button.click();
}
public void button1()
{
	button1.click();
}

public void button2()
{
	button2.click();
}
public void button3()
{
	button3.click();
}
public void button4()
{
	button4.click();
}
}
