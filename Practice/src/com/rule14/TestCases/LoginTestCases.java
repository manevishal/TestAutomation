package com.rule14.TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.rule14.Application.Login;
import com.rule14.Utility.LaunchBrowser;

public class LoginTestCases
{
	  @BeforeSuite
	  public void openBrowser()
	  {
		 LaunchBrowser lb=new LaunchBrowser();
		 lb.launch("cc");
	  }
	  
	  @AfterSuite
	  public void quiteBrowser()
	  {
		 LaunchBrowser lb=new LaunchBrowser();
		 lb.closeBrowser();
	  }
	
	  @Test
	  public void LoginUserSuccess() throws InterruptedException
	  {
		  Login login =new Login();
		  login.loginSuccess();
	  }
	  
	  @Test
	  public void invalidUserCredential() throws InterruptedException
	  {
		  Login login =new Login();
		  login.invalidlogin();
	  }
	  
	  public void logOut() throws InterruptedException
	  {
		  Login login =new Login();
		  login.logOutUser();
	  }
}
