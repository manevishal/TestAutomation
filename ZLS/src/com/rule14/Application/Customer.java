package com.rule14.Application;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rule14.Utility.LaunchBrowser;

public class Customer extends LaunchBrowser
{
	   public WebElement getCustomerTab() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//span[contains(text(),'Customers')]"));
	   }
	   
	   public WebElement getAddCustomerButton() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//span[contains(@class,'margB10 product-btn ng-binding')]"));
	   }
	   
	   public WebElement getCustomerEmail() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//input[contains(@name,'customerEmail')]"));
	   }
	   
	   public WebElement getCustomerName() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//input[contains(@name,'customerName')]"));
	   }
	   
	   public WebElement getCustomerMobileNumber() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//input[contains(@name,'customerMobile')]"));
	   }
	   
	   public WebElement getCustomerAddress() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//textarea[contains(@name,'address1')]"));
	   }
	   
	   public WebElement geteSavebutton() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	   }
	   
	   public WebElement geteCancelbutton() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
	   }
	   
	   public WebElement geteOkbutton() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
	   }
	   
	  /* public WebElement geteOkbuttonDuplicatCustomer() throws InterruptedException
	   {
		  Thread.sleep(7000);
		  return driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
	   }*/
	   
	   public void cancelCustomer() throws InterruptedException
	   {
		   getCustomerTab().click();
		   getAddCustomerButton().click();
		   getCustomerEmail().sendKeys("ganesh11@gmail.com");
		   getCustomerName().sendKeys("Ganesh dd Barate");
		   getCustomerMobileNumber().sendKeys("123334567890");
		   getCustomerAddress().sendKeys("pune,dange chowk");
		   geteCancelbutton().click();
		   System.out.println("Customer cancelled Successfully");
	   }
	   
	   public void addCustomer() throws InterruptedException
	   {
		   getCustomerTab().click();
		   getAddCustomerButton().click();
		   getCustomerEmail().sendKeys("ganesh11@gmail.com");
		   getCustomerName().sendKeys("Ganesh dd Barate");
		   getCustomerMobileNumber().sendKeys("123456667890");
		   getCustomerAddress().sendKeys("pune,dange chowk");
		   geteSavebutton().click();
		   geteOkbutton().click();
		   System.out.println("Customer added Successfully");
	   }
	   
	   public void duplicateCustomer() throws InterruptedException
	   {
		   getCustomerTab().click();
		   getAddCustomerButton().click();
		   getCustomerEmail().sendKeys("ganesh11@gmail.com");
		   getCustomerName().sendKeys("Ganesh Barate");
		   getCustomerMobileNumber().sendKeys("1234567890");
		   getCustomerAddress().sendKeys("pune,dange chowk");
		   geteSavebutton().click();
		   geteOkbutton().click();
		   System.out.println("Customer already exists");
	   }
	   
	   public void waitforCustomerPage()//when we move to home page that time wait for specific element
	   {
		  /* WebDriverWait obj=new WebDriverWait(driver,10);
		   obj.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'OK')]"))));*/
		   FluentWait<WebDriver> obj1=new FluentWait<WebDriver>(driver);
		   obj1.withTimeout(Duration.ofSeconds(10));
		   obj1.withTimeout(10,TimeUnit.SECONDS);
		   obj1.pollingEvery(Duration.ofSeconds(700));//default dom pooling and checking element time 500 ms thats why for change
		                                              //pooling time we use pooling every method in explicit wait
		   obj1.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[contains(text(),'OK')]"))));
		   obj1.ignoring(NoSuchElementException.class);//ignoring specific exception
		  // obj1.ignoreAll(Exception.class);
	   }
}
