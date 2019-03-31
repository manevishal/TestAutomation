package com.rule14.Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Properties_Example
{
   public static void main(String[] args) throws FileNotFoundException, IOException
   {
	   Properties prop = new Properties();
	   prop.load(new FileInputStream("./resources/Config.properties"));
	 //System.out.println(prop.getProperty("BrowserName").toUpperCase());
	   System.out.println(prop.getProperty("xyz"));//if key not exists then return null
	   System.out.println(prop.getProperty("BrowserName").toUpperCase()); 
	 //if the key is duplicate then it will always take from last(bottom)
	   prop.setProperty("BrowserName", "FireFox");
	   System.out.println(prop.getProperty("BrowserName").toUpperCase());
	   
   }
}
