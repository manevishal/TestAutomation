package com.rule14.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileDemo
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Properties prop = new Properties();
		prop.load(new FileInputStream(new File("./resources/zls.properties")));
		
		System.out.println(prop.getProperty("BrowserName"));
		System.out.println(prop.getProperty("URL"));
		
		/*prop.setProperty("BrowserName","Firefox");
		prop.setProperty("URL","https://wwww.google.com");
		
		System.out.println(prop.getProperty("BrowserName"));
		System.out.println(prop.getProperty("URL"));*/
		
		//variable is not present then it will give value null and continue the execution thats why use properties file
		System.out.println(prop.getProperty("XYZ"));
		System.out.println("I am still getting exuted");
		
		System.out.println(prop.getProperty("BrowserName","IE"));
		System.out.println(prop.getProperty("BrowserName"));
		
	}

	
}
