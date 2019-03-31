package com.rule14.TestCase;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest
{
  @Parameters({"BrowserName"})	
  @Test
  public void f(String name)
  {
	  System.out.println(name);
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("I am in Before Method");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("I am in After Method");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("I am in Before Class");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("I am in Aftyer Class");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("I am in Before Test");
  }

  @AfterTest
  public void afterTest()
  {
	  System.out.println("I am in After Test");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("I am in Before Suite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("I am in After Suite");
  }

}
