package controlflow;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :12:26:46 PM  
 * project :CoreJava
 * 
 * Program to display ur name 10 times & nos from 1-10.
*/

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;// loop initialization
		
		
		while(i<=10)//set a condition for loop
		{
			System.out.println(i+" mohana");
			i=i+1; //increment the loop
		}
		System.out.println("Exit Loop");
		System.out.println("*********Reverse Loop**************");
		int j = 10;
		while (j>=1)
		{
			System.out.println(j+"\t");
			j = j-1; //decrement loop
		}

	}

}
