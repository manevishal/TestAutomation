package com.rule14.TestCases;

import com.rule14.Application.Login;
import com.rule14.Utility.LaunchBrowser;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException
	{
		LaunchBrowser lb=new LaunchBrowser();
		lb.launch("cc");
		Login ln=new Login();
		ln.loginSuccess();

	}

}
