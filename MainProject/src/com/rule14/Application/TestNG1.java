package com.rule14.Application;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG1 
{
  @Test
  public void f()
  {
	  System.out.println("I am in Test");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("I am in before Test");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("I am in after Test");
  }

}
