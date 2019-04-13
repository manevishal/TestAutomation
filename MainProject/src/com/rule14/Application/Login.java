package com.rule14.Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.rule14.Utility.LaunchBrowser;

public class Login extends LaunchBrowser
{
    public WebElement getUsername()
    {
    	return driver.findElement(By.xpath("//input[@name='userName']"));
    }
    
    public WebElement getPassword()
    {
    	return driver.findElement(By.xpath("//input[@name='password']"));
    }
    
    public WebElement getSubmit()
    {
    	return driver.findElement(By.xpath("//input[@value='Login']"));
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
}
