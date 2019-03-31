package com.rule14.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rule14.Utility.LaunchBrowser;

public class Login extends LaunchBrowser
{
    public WebElement getUsername() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//input[@name='userName']"));
    }
    
    public WebElement getPassword() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//input[@name='password']"));
    }
    
    public WebElement getSubmit() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//input[@value='Login']"));
    }
    
    public WebElement getSignOff() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]"));
    }
    
    public void loginSuccess() throws InterruptedException
    {
    	getUsername().sendKeys("mercury");
    	
    	getPassword().sendKeys("mercury");
    	
    	getSubmit().click();
    	Thread.sleep(1000);
    }
    
    public void invalidlogin() throws InterruptedException
    {
    	getUsername().sendKeys("mercury1");
    	
    	getPassword().sendKeys("mercury1");
    	
    	getSubmit().click();
    	
    }
    
    public void logOutUser() throws InterruptedException
    {
    	getSignOff().click();
    }
}
