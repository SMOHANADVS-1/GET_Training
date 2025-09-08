package controlflow;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 1, 2025
 * Time    :2:22:16 PM  
 * project :CoreJava
*/

public class DoWhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=20;
		
		do {
			System.out.print(i+"\t");
			i=i+1;
			
		} while (i<=50);
		
		System.out.println();
		
		System.out.println("**************** Guess Names *****************");
		String guess;
		Scanner s=new Scanner(System.in);
		
		do {
			System.out.println("Guess My Name : ");
			guess = s.next();
			
		} while (!"James".equals(guess));
		System.out.println("Congratulations You guessed the name corectly!!!!"+guess);
		s.close();
		
	}

}
