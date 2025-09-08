package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :3:09:57 PM  
 * project :CoreJava
 * 
 *  Program to display Multiplication Table of a number
*/

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num=s.nextInt();
		
		System.out.println("Multiplication Table of : "+num);
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+num*i);
		}
		s.close();

	}

}
