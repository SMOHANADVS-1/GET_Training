package assignments_day3;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :3:59:11 PM  
 * project :Java_Assignments
*/

public class Largest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your num1: ");
		int num1= s.nextInt();
		System.out.println("Enter Your num2: ");
		int num2= s.nextInt();
		System.out.println("Enter Your num3: ");
		int num3= s.nextInt();
		
		if(num1 >num2 && num1>num3)
		{
			System.out.println("The Largest Number is: "+num1);
		}
		else if(num3 >num2 && num3>num1)
		{
			System.out.println("The Largest Number is: "+num3);
		}
		else
		{
			System.out.println("The Largest Number is: "+num2);	
		}
		s.close();

	}

}
