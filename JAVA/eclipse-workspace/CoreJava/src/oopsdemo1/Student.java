package oopsdemo1;

import java.util.Scanner;

/**
 * Author  :Sola.Sri
 * Date    :Sep 2, 2025
 * Time    :4:11:28 PM  
 * project :CoreJava
 * 
 * Java class to define blueprint of a Student
*/
//Instance class

public class Student {
	// properties/states/attributes
	
	// private variables can be accessed only within the class
	
	private int rollNumber;
	private String name, course;
	private float m1,m2,m3,total;
	
	Scanner s=new Scanner(System.in);
	
	//instance methods/behaviour/ functions
	
	//Jvm will invoke default Constructor for initialization of objects
	
	public void input()
	{
		System.out.println("Enter Roll No, Name, Course: ");
		rollNumber = s.nextInt();
		name = s.next();
		course = s.next();
		
		System.out.println("Enter marks of 3 subjects : ");
		m1= s.nextFloat();
		m2 = s.nextFloat();
		m3 = s.nextFloat();
	}
	
	public float calculate() //method with return type float
	{
		total = m1+m2+m3;
		return total;
	}
	
	public void display()
	{
		System.out.println("****************Student Details***********");
		System.out.println("Roll No        :"+rollNumber);
		System.out.println("Name           :"+name);
		System.out.println("course         :"+course);
		System.out.println("Total Marks    :"+total);
		System.out.println();
	}
	
}
