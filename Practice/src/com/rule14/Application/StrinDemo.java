package com.rule14.Application;

public class StrinDemo {

	public static void main(String[] args)
	{
		String s="Mane";
		String s1="Mane1";
		//String s1=new String("Mane");
		if(s==s1)//compare address 
		{
			System.out.println("Both string are constant");
		}
	
		if(s.equals(s1))//compare content
		{
			System.out.println("Both string are Same");
		}
		
		s.concat("Vishal");
		System.out.println(s);
		StringBuffer buffer= new StringBuffer("Mane");
		StringBuffer buffer2= new StringBuffer("Mane");
		if(buffer==buffer2)
		{
			System.out.println("Both string are constant from buffer");
		}
		
		if(buffer.equals(buffer2))
		{
			System.out.println("Both string are Same from buffer");
		}
		buffer.append("vishal");
		System.out.println(buffer);

	}

}
