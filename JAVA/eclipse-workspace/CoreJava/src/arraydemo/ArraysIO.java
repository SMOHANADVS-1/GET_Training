package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 2, 2025
 * Time    :10:03:10 AM  
 * project :CoreJava
 * 
 * 
 * Program to enter elements into array and display it
*/

public class ArraysIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks[] = {78,56,23,44,90,67,55,35,84};
		System.out.println("*********** Array of Marks ***********");
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]+"\t");
		}
		System.out.println();
		System.out.println("The Size Of the Array is : "+marks.length);
		System.out.println("First element of the array is : "+marks[0]);
		System.out.println("Last element of the array is : "+marks[marks.length-1]);
		
		//enter the values at runtime
		
		System.out.println("************************************************");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter total no of students : ");
		int n=scanner.nextInt();
		
		int marks2[] = new int[n]; //declare array and allocate memory of size n
		
		System.out.println("Enter Marks2 Array Elements : ");
		for(int i=0;i<n;i++)
		{
			marks2[i] = scanner.nextInt();
		}
		
		System.out.println("*********** Marks2 Array Contents ************");
		for(int i=0;i<marks2.length;i++)
		{
			System.out.println(marks2[i]+" ");
		}
		System.out.println();
		System.out.println("Display Marks Array without Loop");
		System.out.println(Arrays.toString(marks));
		
		scanner.close();

	}

}
