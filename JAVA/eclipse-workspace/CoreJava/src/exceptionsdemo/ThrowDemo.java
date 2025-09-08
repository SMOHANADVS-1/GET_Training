package exceptionsdemo;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :3:28:15 PM  
 * project :CoreJava
*/

public class ThrowDemo {

	
	public static void hello(int a)
	{
		if(a == 0)
		{
			throw new ArithmeticException("Pass Non Zero Values"); //exception thrown manually;
		}
		else
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		
		hello(100);
		hello(0);

	}

}
