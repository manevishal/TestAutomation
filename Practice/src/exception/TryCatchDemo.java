package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchDemo
{

	public static void main(String[] args) 
	{
		System.out.println("I am in main method");
		m1();
		
    }
	
	public static void m1() 
	{
		
		try
		{
			System.out.println("I am Throwing aritmetic exception");
		    System.out.println(10/0);//error comes then rest of code not executed and goes outside of try block
		    FileInputStream obj=new FileInputStream("so");
		}
		//System.out.println("I am inbetween try and catch");
		catch(ArithmeticException e)// exception sequence child to parent Arithmetic is child
		{
			/*try
			{
				System.out.println(10/0);
			}
			catch(ArithmeticException e1)
			{
				System.out.println("in inner catch block");
			}*/
			//e.printStackTrace();
			System.out.println("I am in catch block1 of arithmetic");
			/*System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());*/
			System.out.println(e.getStackTrace());
			//e.printStackTrace();
		}
		catch(Exception e)// exception sequence child to parent exception is parent//it is also partial exception(checked/unchecked)
		{
			System.out.println("I am in catch block2 of file");
			//e.printStackTrace();
		}
		System.out.println("I am still running");
		/*finally 
		{
			System.out.println("I am in finally block");
		}*/
		
	}
	
	public void m2()
	{
		m1();
	}
}
