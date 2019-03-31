package com.rule14.ExtReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo
{
	@Test(priority = 5)
	public void f1() {
		System.out.println("I am before assert");
		//Assert.assertTrue(false);
		SoftAssert obj=new SoftAssert();
		obj.assertTrue(false);
		System.out.println("I am after assert");
		obj.assertAll();
	}

	@Test(priority = 2)
	public void f2() {
		System.out.println("I am from method2");
	}

	@Test(priority = 1)
	public void f3() {
		System.out.println("I am from method3");
	}
}
