package com.rule14.StringExamples;

public class ReverseString 
{

	public static void main(String[] args) 
	{
	   String s="vishalmane";
	   int len=s.length();
	   System.out.println(s.length());
	   String s2="";
	   
	   for(int i=len-1;i>=0;i--)
	   {
		   s2=s2+s.charAt(i);
	   }
	   
	   System.out.println(s2);

	}

}
