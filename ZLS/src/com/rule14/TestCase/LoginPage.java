package com.rule14.TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.rule14.Application.Login;

public class LoginPage
{
	
	
	/* @BeforeSuite
	  public void openBrowser()
	  {  
		 LaunchBrowser open =new LaunchBrowser();
		 open.launch("cc");
	  }*/
	  
	  
	
	  @BeforeMethod
	  public void loginsuccessfully() throws InterruptedException
	  {
		  Login login = new Login();
		  login.LoginSuccess();
	  }
	  
	  @Test(priority=1)
	  public void invalidloginUser() throws InterruptedException
	  {
		  Login login = new Login();
		  login.invalidLogin();
		  login.clearData();
	  }
	  
	  @AfterMethod
	  public void logOutUser() throws InterruptedException
	  {
		  Login login = new Login();
		  login.logOut();
	  }
	  
}
