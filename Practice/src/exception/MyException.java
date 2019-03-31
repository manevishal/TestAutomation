package exception;

public class MyException extends Exception implements AutoCloseable
{
    String exceptionmsg;
    
    public MyException(String errmsg)
    {
    	exceptionmsg=errmsg;
    }
    
	public void errorMessage()
	{
		switch(exceptionmsg)
		{
		   case "FILE_NOT_FOUND":
			   System.out.println("File is not found/not present at particular location");
			   break;
			   
		   case "ARITHMETIC":
			    System.out.println("Arithmetic exception");
			    break;
			    
		   default:
			   System.out.println("Somethig went wrong");
			   break;
		}
	}
	public static void main(String[] args) 
	{
		
	}

	@Override
	public void close() throws Exception
	{
		System.out.println("I am from java 7 close method");
		
	}

}
