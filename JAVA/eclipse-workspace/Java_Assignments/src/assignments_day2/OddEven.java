package assignments_day2;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 17, 2025
 * Time    :2:54:38 PM  
 * project :Java_Assignments
*/

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number :");
		int num = s.nextInt();
		if(num % 2 ==0)
		{
			System.out.println("Even Number");
		}
		else
			System.out.println("Odd Number");
			

	}

}
