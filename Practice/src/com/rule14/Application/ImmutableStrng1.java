package com.rule14.Application;

public final class ImmutableStrng1 
{

	
		String s;
		
		private final int p;
		
		public ImmutableStrng1(int a)
		{
			p=a;
			
			//System.out.println(p);
			
		}
		
		public int getp()
		{
			return p;
		}
	
	 public static void main(String[] args)
	 {
		 ImmutableStrng1 obj= new ImmutableStrng1(5);
		 System.out.println(obj.p);
		 //obj.p=10;
		 
	 }
}
