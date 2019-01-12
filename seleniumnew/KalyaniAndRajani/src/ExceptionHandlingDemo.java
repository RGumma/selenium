import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.http.impl.client.AIMDBackoffManager;


public class ExceptionHandlingDemo {

	
	int a,b,c;
	
	

	void div(int a,int b)  
	{
		try{
		c=a/b;
		System.out.println("The output is"+c);
		}
		catch(ArithmeticException e)
		{
			e.getMessage();
		}
		finally
		{
			
		}
			
	}
	
	
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub

		ExceptionHandlingDemo ex =new ExceptionHandlingDemo();
		
		ex.div(20, 0);
		
		
		
		
	}

}
