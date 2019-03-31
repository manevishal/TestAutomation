package com.rule14.TestNG;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG1 
{
  @Test
  public void f1() 
  {
	  System.out.println("I am in TestCase-1");
  }
  
  @Test
  public void f2() 
  {
	  System.out.println("I am in TestCase-2");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("I am in BeforeMethod");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("I am in AftereMethod");
  }

  @BeforeClass
  public void beforeClass()
  {
	  System.out.println("I am in BeforeClass");
  }

  @AfterClass
  public void afterClass()
  {
	  System.out.println("I am in BAfterClass");
  }

  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("I am in BeforeTest");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("I am in AfterTest");
  }

  @BeforeSuite
  public void beforeSuite()
  {
	  System.out.println("I am in BeforeSuite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("I am in AfterSuite");
  }

}
