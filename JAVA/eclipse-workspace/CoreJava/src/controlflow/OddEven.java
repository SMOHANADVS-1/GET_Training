package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :10:04:46 AM  
 * project :CoreJava
 * 
 * Program to check entered number is odd or even.
*/

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		num=scanner.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println( num+" is even number");
		}
		else {
			System.out.println(num+" is odd number");
		}
		
		scanner.close();
	}

}
