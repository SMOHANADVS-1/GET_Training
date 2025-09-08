package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :3:00:56 PM  
 * project :CoreJava
 * program to find factorial of a number.
*/

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int num, fact=1;
		        Scanner scanner=new Scanner(System.in);

		        System.out.println("Enter a Number : ");
		        num=scanner.nextInt();
		        scanner.close();

		        for (int i = 1; i <=num; i++) {
		           fact*=i;
		        }
		        System.out.println("The Factorial of "+num+" is: "+fact);

	}

}
