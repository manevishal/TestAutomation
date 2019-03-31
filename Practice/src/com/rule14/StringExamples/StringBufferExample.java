package com.rule14.StringExamples;

public class StringBufferExample
{

	public static void main(String[] args)
	{
		//mutable means modifiable or user can be changed
		StringBuffer str = new StringBuffer("Vishal");
		str.append("Mane");
		str.reverse();
		System.out.println(str);
	}

}
