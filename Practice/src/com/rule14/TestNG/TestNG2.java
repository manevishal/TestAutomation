package com.rule14.TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG2
{
	  @Test(invocationCount=2,priority=2,description="Verify f3() functionality",alwaysRun=true,enabled=false)
	  public void f3() 
	  {
		  System.out.println("I am in TestCase-3");
	  }
	  
	  @Test(invocationCount=2,priority=1,description="Verify f3() functionality")
	  public void f4() 
	  {
		  System.out.println("I am in TestCase-4");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod()
	  {
		  System.out.println("I am in BeforeMethod from TestNG-2");
	  }

	  @AfterMethod
	  public void afterMethod() 
	  {
		  System.out.println("I am in AftereMethod from TestNG-2");
	  }

	  @BeforeClass
	  public void beforeClass()
	  {
		  System.out.println("I am in BeforeClass from TestNG-2");
	  }

	  @AfterClass
	  public void afterClass()
	  {
		  System.out.println("I am in BAfterClass from TestNG-2");
	  }

	  @BeforeTest
	  public void beforeTest()
	  {
		  System.out.println("I am in BeforeTest from TestNG-2");
	  }

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("I am in AfterTest from TestNG-2");
	  }

	  @BeforeSuite
	  public void beforeSuite()
	  {
		  System.out.println("I am in BeforeSuite from TestNG-2");
	  }

	  @AfterSuite
	  public void afterSuite()
	  {
		  System.out.println("I am in AfterSuite from TestNG-2");
	  }
  
}
