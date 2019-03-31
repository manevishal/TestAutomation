package com.rule14.StringExamples;

public class Vowels {

	public static void main(String[] args) 
	{
		int vowels=0;
		String str="Rule14 India Pvt ltd SB Road Pune";
		
		for (int i = 0;i<str.length();i++) 
		{
			char ch=str.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
			{
	                vowels++;
			}
			
		}
		System.out.println("Number of Vowels:"+vowels);
	}

}
