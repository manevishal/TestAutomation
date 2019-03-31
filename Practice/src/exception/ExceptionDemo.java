package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo 
{

	public static void main(String[] args) throws FileNotFoundException
	{
		System.out.println("I am in main method");
		m1();
		
    }
	
	public static void m1() throws FileNotFoundException
	{
		System.out.println("I am Throwing aritmetic exception");
		System.out.println(10/0);
		FileInputStream obj=new FileInputStream("so");
	}
	
	public void m2() throws FileNotFoundException
	{
		m1();
	}

}
