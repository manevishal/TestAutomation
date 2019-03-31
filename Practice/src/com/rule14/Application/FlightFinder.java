package com.rule14.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.rule14.Utility.LaunchBrowser;

public class FlightFinder extends LaunchBrowser
{
	
	
   public WebElement getTypeRoundTrip() throws InterruptedException
   {   
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//input[@value='roundtrip']"));
   }
   
   public WebElement getTypeOneWay() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//input[@value='oneway']"));
   }
   
   public WebElement getPassenger() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='passCount']"));
   }
   
   public WebElement getDepartingFrom() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='fromPort']"));
   }
   
   public WebElement getOnMonth() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='fromMonth']"));
   }
   
   public WebElement getOnDate() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='fromDay']"));
   }
   
   public WebElement getArrivingIn() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='toPort']"));
   }
   
   public WebElement getReturningMonth() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='toMonth']"));
   }
   
   public WebElement getReturningDate() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='toDay']"));
   }
   
   public WebElement getEconomyServiceClass() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//input[@value='Coach']"));
   }
   
   public WebElement getBusinessServiceClass() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//input[@value='Business']"));
   }

   public WebElement getFirstServiceClass() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//input[@value='First']"));
   }
   
   public WebElement getAirLine() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//select[@name='airline']"));
   }
   
   public WebElement getContinueButton() throws InterruptedException
   {
	   Thread.sleep(10000);
	   return driver.findElement(By.xpath("//input[@name='findFlights']"));
   }
   
   public void getEconomyClassTicket() throws InterruptedException
   {
	   Select passenger=new Select(getPassenger());
	   passenger.selectByValue("2");
	   Select departingform=new Select(getDepartingFrom());
	   departingform.deselectByValue("Frankfurt");
	   Select onmonth=new Select(getOnMonth());
	   onmonth.selectByValue("4");
	   Select ondate=new Select(getOnDate());
	   ondate.selectByValue("5");
	   Select arrivingin=new Select(getArrivingIn());
	   arrivingin.selectByValue("London");
	   Select returnungmonth=new Select(getReturningMonth());
	   returnungmonth.selectByValue("7");
	   Select returnundate=new Select(getReturningDate());
	   returnundate.selectByValue("10");
	   Select airline=new Select(getAirLine());
	   airline.selectByValue("10");
	   getContinueButton().click();
   }
   
   public void getFirstClassTicket() throws InterruptedException
   {
	   getTypeOneWay().click();
	   Select passenger=new Select(getPassenger());
	   passenger.selectByValue("4");
	   Select departingform=new Select(getDepartingFrom());
	   departingform.deselectByValue("Frankfurt");
	   Select onmonth=new Select(getOnMonth());
	   onmonth.selectByValue("4");
	   Select ondate=new Select(getOnDate());
	   ondate.selectByValue("5");
	   Select arrivingin=new Select(getArrivingIn());
	   arrivingin.selectByValue("London");
	   Select returnungmonth=new Select(getReturningMonth());
	   returnungmonth.selectByValue("7");
	   Select returnundate=new Select(getReturningDate());
	   returnundate.selectByValue("10");
	   getFirstServiceClass().click();
	   Select airline=new Select(getAirLine());
	   airline.selectByValue("10");
	   getContinueButton().click();
   }
   
   public void getBusinessClassTicket() throws InterruptedException
   {
	   getTypeOneWay().click();
	   Select passenger=new Select(getPassenger());
	   passenger.selectByValue("5");
	   Select departingform=new Select(getDepartingFrom());
	   departingform.deselectByValue("Frankfurt");
	   Select onmonth=new Select(getOnMonth());
	   onmonth.selectByValue("4");
	   Select ondate=new Select(getOnDate());
	   ondate.selectByValue("5");
	   Select arrivingin=new Select(getArrivingIn());
	   arrivingin.selectByValue("London");
	   Select returnungmonth=new Select(getReturningMonth());
	   returnungmonth.selectByValue("7");
	   Select returnundate=new Select(getReturningDate());
	   returnundate.selectByValue("10");
	   getBusinessServiceClass().click();
	   Select airline=new Select(getAirLine());
	   airline.selectByValue("10");
	   getContinueButton().click();
   }

}
