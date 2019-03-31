package com.rule14.Application;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo 
{

	public static void main(String[] args)  
	{
		ExceptionDemo ed=new ExceptionDemo();
         ed.testing();
	}
	
	public void handleExp() 
	{
		
		try
		{
			FileInputStream obj= new FileInputStream(new File("text.txt"));
		} catch (FileNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testing() 
	{
		handleExp();
	}

}
