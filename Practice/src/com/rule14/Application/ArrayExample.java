package com.rule14.Application;

public class ArrayExample {
	
	static String[] employes=new String[5];
	
	static int[] b={12,21,34,54};
	
	static String[] a;
	
    public static void main(String[] args) 
	{
		//employes=new String[5];
		System.out.println(employes.length);
		System.out.println();
		//System.out.println(a);
		employes[0]="test1";
		employes[1]="test2";
		employes[2]="test3";
		employes[3]="test4";
		employes[4]="test5";
		
		for(int i=0;i<employes.length;i++)
		{
			System.out.println(employes[i]);
			
		}
		System.out.println();
		for(int i=0;i<b.length;i++)
		{
			  System.out.println(b[i]);	
		}
	}

}
