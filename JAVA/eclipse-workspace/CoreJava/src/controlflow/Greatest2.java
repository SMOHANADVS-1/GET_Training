package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :9:37:11 AM  
 * project :CoreJava
 * 
 * Program to find greatest of 2 numbers.
*/

public class Greatest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter 2 numbers : ");
		a=scanner.nextInt();
		b=scanner.nextInt();
		
		if (a>b) {
		System.out.println(a+" is Greatest");
			
		}
		else {
			System.out.println(b+" is Greatest");
		}
		
		
		scanner.close();
		

	}

}
