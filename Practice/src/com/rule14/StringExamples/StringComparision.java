package com.rule14.StringExamples;

public class StringComparision 
{

	public static void main(String[] args)
	{
		String s="Vishal";
		String s1="vishal";
		String s3=new String("VISHAL");
		String s4="Vaibhav";
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s3));
		
		   String s7="Sachin";  
		   String s8="Sachin";  
		   String s9=new String("Sachin");  
		   
		   System.out.println(s7==s8);
		   System.out.println(s8==s9);
		   
		

	}

}
