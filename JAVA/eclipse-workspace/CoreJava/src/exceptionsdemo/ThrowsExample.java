package exceptionsdemo;

import java.io.IOException;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :3:49:45 PM  
 * project :CoreJava
*/

public class ThrowsExample {
	
	void myMethod(int a) throws IOException,ArithmeticException
	{
		if(a == 1)
		 throw new IOException("IOException Occurred");
		else
			 throw new ArithmeticException("Arithmetic Exception");
			
	}

	public static void main(String[] args) {
		ThrowsExample t = new ThrowsExample();
		try {
			t.myMethod(1);
		}
		catch (Exception ex) {
			System.err.println(ex);
		}
		
	}

}
