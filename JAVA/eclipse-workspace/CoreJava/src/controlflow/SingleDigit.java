package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :10:09:55 AM  
 * project :CoreJava
*/

public class SingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter number : ");
		num=scanner.nextInt();
		
		if(num > -10 && num <10)
		{
			System.out.println( num+" is a Single Digit");
		}
		else {
			System.out.println(num+" is not a Single Digit");
		}
		
		scanner.close();

	}

}
