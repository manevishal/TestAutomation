package com.rule14.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser
{

   public static WebDriver driver;
	
   public void launch(String browsername)
   {
	   if(browsername=="chrome"||browsername=="cc")
	   {
		   System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get("http://newtours.demoaut.com/mercurysignon.php");
	   }
	   else if(browsername=="firefox"||browsername=="ff")
	   {
		   System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
		   driver=new FirefoxDriver();
		   driver.get("http://newtours.demoaut.com/mercurysignon.php");
	   }
	   else
	   {
		   System.setProperty("webdriver.ie.driver", "./resources/IEDriverServer.exe");
		   driver=new InternetExplorerDriver();
		   driver.get("http://newtours.demoaut.com/mercurysignon.php");
	   }
   }
}
