package com.rule14.ExtReports;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportGeneration 
{

	public static ExtentReports reports;
    public static ExtentTest test;
    public static WebDriver driver;

      
        @BeforeClass
        public void startTest()
	    {
	              reports = new ExtentReports(System.getProperty("user.dir") + "//test-output2//Extentreport.html",true);
	    }
       
        @Test(alwaysRun=true)
        public void openApplication()
	    {
    	     test = reports.startTest("OpenApplication");
	         System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.get("https://icdemo.zuma.global/zlsapp/#/login");
	         if(driver.getTitle().equals("Zuma Liquidity Solutions"))
	         {
	        	 test.log(LogStatus.PASS, "Successfully opens the application URL");
	        	 
	         }
	         else
	         {
	        	 test.log(LogStatus.FAIL, "Test Failed Navigated to the specified URL");
	        	 
	         }

	    }
	
       @AfterClass
	   public void endTest()
	   {
    	   reports.endTest(test);
           reports.flush();
           driver.close();
	   }
	
      
}
