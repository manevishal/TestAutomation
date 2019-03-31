package com.rule14.Application;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.rule14.Utility.LaunchBrowser;

public class Product extends LaunchBrowser
{
	public WebElement getProductTab() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//span[contains(text(),'Products')]"));
    }
	
	public WebElement getProductButton() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//span[contains(@type,'button')]"));
    }
	
	public WebElement getProductName() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//input[contains(@name,'itemNumber')]"));
    }
	
	public WebElement getProductDescription() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//textarea[contains(@name,'itemDesc')]"));
    }
	
	public WebElement getProductPrize() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//input[contains(@name,'unitPrice')]"));
    }
	
	public WebElement getSaveButton() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
    }
	
	public WebElement getCancelButton() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
    }
	
	public WebElement getOkButton() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//span[contains(text(),'OK')]"));
    }
	
	public WebElement getOkduplicateProduct() throws InterruptedException
    {
		Thread.sleep(7000);
    	return driver.findElement(By.xpath("//button[contains(@type,'button')]"));
    }
   
   
   public void cancelProduct() throws InterruptedException
   {
	   getProductTab().click();   
	   getProductButton().click();
	   getProductName().sendKeys("Design11 Material");
	   getProductDescription().sendKeys("Design Material");
	   getProductPrize().sendKeys("5000");
	   getCancelButton().click();
	   getOkButton().click();
	   System.out.println("Product cancelled Successfully");
   }
   
   public void addProduct() throws InterruptedException
   {
	   getProductTab().click();   
	   getProductButton().click();
	   getProductName().sendKeys("Design11 Material");
	   getProductDescription().sendKeys("Design Material");
	   getProductPrize().sendKeys("5000");
	   getSaveButton().click();
	   getOkButton().click();
	   System.out.println("Product added Successfully");
   }
   
   public void duplicateProduct() throws InterruptedException
   {
	   getProductTab().click();   
	   getProductButton().click();
	   getProductName().sendKeys("Design11 Material");
	   getProductDescription().sendKeys("Design Material");
	   getProductPrize().sendKeys("5000");
	   getSaveButton().click();
	   getOkduplicateProduct().click();
	   System.out.println("Product already exists");
   }
   
}
