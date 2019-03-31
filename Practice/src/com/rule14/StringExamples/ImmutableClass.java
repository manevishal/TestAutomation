package com.rule14.StringExamples;

public final class ImmutableClass
{
    private final int a;
    private final int b;
    
    // private final int a=10;
    // private final int b=20;
    //once final variable initialized we can not change its value thats why value pass in constructor and change value of variable while create constructor..
    //when create object final variable value should be change then need to pass in constructor
    
    
    public ImmutableClass(int i,int j)
    {
    	a=i;
    	b=j;
    }
    
    public int getA()
    {
    	return a;
    }
    
    public int getB()
    {
    	return b;
    }
    
    /* public void setA(int i)
    {
    	a=i;
    }*/
    
	/*public static void main(String[] args)
	{
		ImmutableClass ic=new ImmutableClass(88,100);
		ImmutableClass ic2=new ImmutableClass(200,400);
		
		System.out.println(ic.a);
		System.out.println(ic.b);
		
		System.out.println(ic2.a);
		System.out.println(ic2.b);
	}*/

}
