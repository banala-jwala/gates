package com.guru.testcase;

import org.testng.annotations.Test;

import com.guru.pageobjects.LoginPage;

public class testCase extends BaseClass
{
       @Test
       public void test() throws InterruptedException
       {
    	  driver.get(baseUrl);
    	  LoginPage lp=new LoginPage(driver);
    	  lp.signUp();
    	  Thread.sleep(6000);
    	  //driver.get("https://app.testproject.io/signup/");
    	  lp.email(email);
    	 lp.c();
   	  
       } 
}