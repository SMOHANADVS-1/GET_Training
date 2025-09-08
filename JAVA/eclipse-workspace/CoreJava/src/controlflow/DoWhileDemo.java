package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :2:19:42 PM  
 * project :CoreJava
 * 
 * Program to enter a Positive Number & display it
*/

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int number;
		        Scanner scanner=new Scanner(System.in);

		        do{
		            System.out.println("Enter a Number : ");
		            number=scanner.nextInt();
		            System.out.println(number);
		        }while(number>0);

		        System.out.println("The Entered Number is : "+number);

	}

}
