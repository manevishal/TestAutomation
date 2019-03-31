package com.rule14.Interface;

public class ArrayDemo
{

	public static void main(String[] args)
	{
		int[][] a={{1,2,3},{4,5,6,7,8},{9,10,11,12,13,14,15}};
		
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		System.out.println(a[2].length);
		System.out.println(a.length);
   }

}
//in array array variable and method(local variable) before use need to intialize otherwise null pointer exception
//for instance and static variable default value initialized to zero if not initialized
//in array length is variable and in string length is function
//null pointer occurs because object declared in method that is local and after method it is dead and you try to Access in class