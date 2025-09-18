package assignments_day2;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :2:03:13 PM  
 * project :Java_Assignments
*/

public class SimpleCalculator {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num1: ");
		int a=s.nextInt();
		System.out.println("Enter num2: ");
		int b = s.nextInt();
		System.out.println("The Addition of 2 num is:"+(a+b));
		System.out.println("The Subraction of 2 num is:"+(a-b));
		System.out.println("The Multiplication of 2 num is:"+(a*b));
		System.out.println("The Division of 2 num is:"+(a/b));

	}

}
