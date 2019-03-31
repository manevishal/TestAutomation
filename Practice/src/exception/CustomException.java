package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CustomException 
{ 

	public void readFileAfter7() throws Exception
	{
		//after execute try automatically relase object after java7 
		try(MyException obj1=new MyException("Resource");FileInputStream obj=new FileInputStream("so"))
		{
			  System.out.println(10/0);
			 //FileInputStream obj=new FileInputStream("so");
	    }
		
		catch(FileNotFoundException e)
		{
			System.out.println("I am from read file file not found exception");
			throw new MyException("FILE_NOT_FOUND");
		}
		catch(ArithmeticException e)
		{
			System.out.println("I am from read file Arithmetic exception");
			throw new MyException("ARITHMETIC");
		}
		
		/*catch(FileNotFoundException |ArithmeticException e)
		{
			throw new MyException("FILE_NOT_FOUND");
			
		}*/
	
		
	}

	public void readFile() throws MyException
	{
		try
		{
			  System.out.println(10/0);
			  FileInputStream obj=new FileInputStream("so");
	    }
	/*	catch(FileNotFoundException e)
		{
			System.out.println("I am from read file file not found exception");
			throw new MyException("FILE_NOT_FOUND");
		}
		catch(ArithmeticException e)
		{
			System.out.println("I am from read file Arithmetic exception");
			throw new MyException("ARITHMETIC");
		}*/
		catch(FileNotFoundException |ArithmeticException e)
		{
			throw new MyException("FILE_NOT_FOUND");
			
		}
	
		
	}
	
	public static void main(String[] args) throws Exception
	{
		CustomException ce=new CustomException();
		try
		{
            //ce.readFile();
            ce.readFileAfter7();
		}
		catch(MyException e)
		{
		   e.errorMessage();
		}
		
	}

}
