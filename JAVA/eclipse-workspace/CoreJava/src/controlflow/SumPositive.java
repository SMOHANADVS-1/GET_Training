package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :12:44:58 PM  
 * project :CoreJava
 * Java Program to find Sum of Positive Numbers
*/

public class SumPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int sum=0,number=0;
	        Scanner input =new Scanner(System.in);

	// Loop continues until entered number is Positive
	        while (number>=0) {
	        	sum = sum+number;
	        	System.out.println("Enter a number : ");
	        	number=input.nextInt();
				
			}
	        System.out.println("The Sum Of Positive Numbers is: "+sum);
	        input.close();

	}

}
