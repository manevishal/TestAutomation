package com.rule14.Application;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import com.rule14.Utility.LaunchBrowser;

public class Login extends LaunchBrowser
{
	public WebElement getUsername() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//input[@placeholder='example@abc.com']"));
    }
	
	public WebElement getPassword() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//input[@placeholder='Password']"));
    }
	
	public WebElement getLoginButton() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//input[@value='Login']"));
    }
	
	public WebElement getUserIcon() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//img[contains(@class,'user-image')]"));
    }
	
	public WebElement getLogOut() throws InterruptedException
    {
    	Thread.sleep(10000);
    	return driver.findElement(By.xpath("//a[contains(text(),'Logout')]"));
    }
	
	public void LoginSuccess() throws InterruptedException
	{
		getUsername().sendKeys("CatagoryB@uat.com");
		getPassword().sendKeys("Passw0rd");
		getLoginButton().click();
		System.out.println("Login successfully");
	}
	
	public void invalidLogin() throws InterruptedException
	{
		getUsername().sendKeys("CatagoryAA@uat.com");
		getPassword().sendKeys("Passw0rd");
		getLoginButton().click();
		System.out.println("Invalid Username and Password");
	}
	
	public void logOut() throws InterruptedException
	{
		getUserIcon().click();
		getLogOut().click();
	}
	
	public void clearData() throws InterruptedException
	{
		getUsername().clear();
		getPassword().clear();
	}
}
