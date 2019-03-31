package com.rule14.StringExamples;

public class StringDemo1
{

	public static void main(String[] args)
	{  
		//every variable from string class is private final thats why we can not change its value.
		//String is final class -we can not inherit
		//immutable String(not changable)=once you create object we cant change its value(state/variable),if you try to change ten it will create new object
		String s="Vishal";
		s.concat("Test");
		System.out.println(s);
		

	}

}
