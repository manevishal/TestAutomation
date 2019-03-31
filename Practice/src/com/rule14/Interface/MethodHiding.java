package com.rule14.Interface;

public class MethodHiding extends OverridingDemo
{
	public void m1()
	   {
		   System.out.println("Non static method of child");
	   }
	   
	   //static methods are not overrite,static methods are hiding
	   public static void m2()
	   {
		   System.out.println("static method of child");
	   }

	public static void main(String[] args)
	{
		   
		   
		  // whenever you call non static method then it always call from object(which class object create) it is object level,its method overloading 
		   MethodHiding mh= new MethodHiding();
		   mh.m1();
		   mh.m2();
		   
		   //whenever you call ststic method then it always call parent class method that is method hiding(static methods are class level methods thats why called using parent class reference)
		   OverridingDemo parent= new MethodHiding();
		   parent.m1();//method overridding
		   parent.m2();//method hiding
		   
	}

}
