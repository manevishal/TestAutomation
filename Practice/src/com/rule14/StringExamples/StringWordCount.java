package com.rule14.StringExamples;

public class StringWordCount 
{

	public static void main(String[] args)
	{
		String s="Rule14 India Pvt ltd SB Road Pune";
		String[] str = s.split(" ");
		System.out.println("Total no of word:"+str.length);
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
    }

}
