package com.rule14.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class LaunchBrowser
{
	   public static WebDriver driver;
	   
	   public static Properties prop;
	   
	   public void propertyFile() throws FileNotFoundException, IOException
	   {
		   prop=new Properties();
		   prop.load(new FileInputStream("./resources/config.properties"));
	   }
	   
	   public void launch()
	   {
		   /*System.out.println(prop.getProperty("BrowserName"));
		   System.out.println(prop.getProperty("URL"));*/
		   if(prop.getProperty("BrowserName").equalsIgnoreCase("chrome")||prop.getProperty("BrowserName").equalsIgnoreCase("cc"))
		   {
			   System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
			   driver=new ChromeDriver();
			   driver.get(prop.getProperty("URL"));
			   driver.manage().window().maximize();
		   }
		   else if(prop.getProperty("BrowserName").equalsIgnoreCase("firefox")||prop.getProperty("BrowserName").equalsIgnoreCase("ff"))
		   {
			   System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
			   driver=new FirefoxDriver();
			   driver.get(prop.getProperty("URL"));
			   driver.manage().window().maximize();
		   }
		   else
		   {
			   System.setProperty("webdriver.ie.driver", "./resources/IEDriverServer.exe");
			   driver=new InternetExplorerDriver();
			   driver.get(prop.getProperty("URL"));
			   driver.manage().window().maximize();
		   }
		   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	   }
	   
	   @BeforeSuite
		 public void propLoad() throws FileNotFoundException, IOException
		 {
			 LaunchBrowser open =new LaunchBrowser();
			 open.propertyFile();
			 open.launch();
		 }

	   
	   /*public void launch(String browsername)
	   {
		   if(browsername=="chrome"||browsername=="cc")
		   {
			   System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
			   driver=new ChromeDriver();
			   driver.get("https://zuma.global/zlsapp/#/login");
			   driver.manage().window().maximize();
		   }
		   else if(browsername=="firefox"||browsername=="ff")
		   {
			   System.setProperty("webdriver.gecko.driver", "./resources/geckodriver.exe");
			   driver=new FirefoxDriver();
			   driver.get("https://zuma.global/zlsapp/#/login");
			   driver.manage().window().maximize();
		   }
		   else
		   {
			   System.setProperty("webdriver.ie.driver", "./resources/IEDriverServer.exe");
			   driver=new InternetExplorerDriver();
			   driver.get("https://zuma.global/zlsapp/#/login");
			   driver.manage().window().maximize();
		   }
	   }*/
	   
	   @AfterSuite
	   public void closeBrowser()
	   {
		   driver.close();
	   }
	   
	 
}
