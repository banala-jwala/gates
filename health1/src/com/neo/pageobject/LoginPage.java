package com.neo.pageobject;

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
WebElement txtlinktextHome;
@FindBy
@CacheLookup
WebElement ImageFile;
private WebElement txtlinkchrome; 

@FindBy(id="menu-item-746")
@CacheLookup
WebElement txtlinkAboutGates;

@FindBy(linkText="History")
@CacheLookup
WebElement txtlinktextHistory;

@FindBy(id="menu-item-750")
@CacheLookup
WebElement txtlinkAdmissions;

@FindBy(id="menu-item-751")
@CacheLookup
WebElement txtlinkAcademics;

@FindBy(id="menu-item-752")
@CacheLookup
WebElement txtlinkDepartments;

@FindBy(id="menu-item-753")
@CacheLookup
WebElement txtlinkCampuslife;


public void ClickLinkTextHome() {
	txtlinktextHome.click();
}

public void Clickchrome()
{
	txtlinkchrome.click();
}

  public void ClickLinkTextAboutGates() {
  
  txtlinkAboutGates.click(); }
  
  public void ClickLinkTextHistory() {
  
  txtlinktextHistory.click(); }
  
  
  
  public void ClickLinkTextAdmissions() {
  
  txtlinkAdmissions.click(); } public void ClickLinkTextAcademics() {
  
  txtlinkAcademics.click(); }
  
  
  public void ClickLinkTextDepartments() { txtlinkDepartments.click(); }
  
  public void ClickLinkTextCampuslife() { // TODO Auto-generated method stub
  
  txtlinkCampuslife.click();
  
  }
 
}
