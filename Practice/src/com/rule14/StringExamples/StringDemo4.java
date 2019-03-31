package com.rule14.StringExamples;

public class StringDemo4 
{

	public static void main(String[] args)
	{
		ImmutableClass ic= new ImmutableClass(10,20);
		System.out.println(ic.getA());
		System.out.println(ic.getB());
		//ic.setA(300);
	}

}
