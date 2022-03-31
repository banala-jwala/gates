package com.neo.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.neo.pageobject.LoginPage;

public class TestCase extends BaseClass 
{
	@Test
	public void test()
	{
		
		driver.get(url);
		
		LoginPage page=new LoginPage(driver);
		page.ClickLinkTextHome();
		page.Clickchrome();
		driver.findElement(By.linkText("https://images.unsplash.com/photo-1453728013993-6d66e9c9123a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8dmlld3xlbnwwfHwwfHw%3D&w=1000&q=80"));
		
		  page.ClickLinkTextAboutGates(); 
		  page.ClickLinkTextHistory();
		  page.ClickLinkTextAdmissions(); 
		  page.ClickLinkTextAcademics();
		  page.ClickLinkTextDepartments();
		  page.ClickLinkTextCampuslife();
		  
		 
	
	}
}
