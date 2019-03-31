package com.rule14.StringExamples;

public final class ClassImmutable 
{
   private final int count;
   
   // private final int count=10;
   //final variable not changed after initialize it thats why every time object create then its value changed thats why pass value in constructor
   //whenever object created each and every final variale sould be initialized
   public ClassImmutable(int c)
   {
	   count=c;
   }
   
   public int getCount()
   {
	   return count;
   }
	public static void main(String[] args)
	{
		ClassImmutable im = new ClassImmutable(7);
		System.out.println(im.count);

	}

}
