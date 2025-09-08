package exceptionsdemo;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :2:23:05 PM  
 * project :CoreJava
*/

public class DivisionDemo {

	public static void main(String[] args) {

        int a, b, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input two integers :");
        a = input.nextInt();
        b = input.nextInt();
       
        try {
        result = a / b;
        System.out.println("Result = " + result);
        }
        catch(ArithmeticException ex)
        {
        	System.out.println("Divide by Zero Error. Please enter second number as NON-ZERO");
            ex.printStackTrace(); //Name,Description, StackTrace
            System.out.println("Exception Description :"+ex.getMessage());
            System.out.println("Exception Name & Description :"+ex.toString());
        }
        finally {
        	  input.close();//
        	  System.out.println("In Finally Block");
        }
        
	}

}
