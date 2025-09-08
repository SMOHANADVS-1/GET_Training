package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :10:22:08 AM  
 * project :CoreJava
 * 
 * program to find greatest of 3 numbers.
*/

public class Greatest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
        int num1, num2 , num3;

        System.out.println("Enter 3 Numbers :");
        num1=scanner.nextInt();
        num2=scanner.nextInt();
        num3=scanner.nextInt();
		
		if (num1 > num2 && num1 > num3) {
		System.out.println(num1 +" is Greatest");
			
		}
		else if(num2 > num3) {
			System.out.println(num2+" is Greatest");
		}
		else if(num1 == num2 &&num2 == num3) {
			System.out.println("All Numbers are equal");
		}
		else {
			System.out.println(num3+" is Greatest");
			
		}
		
		
		scanner.close();
		


	}

}
