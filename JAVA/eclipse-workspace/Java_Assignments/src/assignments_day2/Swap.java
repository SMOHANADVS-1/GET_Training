package assignments_day2;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :1:55:16 PM  
 * project :Java_Assignments
*/

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a=s.nextInt();
		System.out.println("Enter num2: ");
		int b = s.nextInt();
		b = a+b;
		a = b-a;
		b = b-a;
		
		System.out.print("a: "+a+" "+"b: "+b);

	}

}
