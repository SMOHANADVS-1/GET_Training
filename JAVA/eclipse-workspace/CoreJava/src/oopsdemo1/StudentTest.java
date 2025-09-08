package oopsdemo1;

/**
 * Author  :Sola.Sri
 * Date    :Sep 2, 2025
 * Time    :4:25:31 PM  
 * project :CoreJava
 * 
 * Java program to implement object oriented programming
*/

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a object of Student class
		Student s1 = new Student();
		Student s2 = new Student();
		
		//invoke methods of student class using dot operator
		s1.input();
		float tot = s1.calculate(); //invoke method and return value
		s1.display();
		System.out.println("Total Displayed from main: "+tot);
		
		//invoke methods of student class using dot operator
		s2.input();
		float tot1 = s2.calculate(); //invoke method and return value
		s2.display();
		System.out.println("Total Displayed from main: "+tot1);
				


	}

}
