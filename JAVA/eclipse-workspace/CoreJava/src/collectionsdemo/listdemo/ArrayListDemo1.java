package collectionsdemo.listdemo;

import java.util.ArrayList;
import java.util.Collections;
/*
 * java program to add elements to ArrayList, perform Manipulations & display elements
 */
public class ArrayListDemo1 {

	public static void main(String[] args) {
		//create a generic ArrayList of type String
		ArrayList<String> p1 = new ArrayList<String>();
		
		//Add ele to arraylist - It maintain order of insertion. data stored in form of objects
		p1.add("Java");
		p1.add("Perl");
		p1.add("C++");
		p1.add("C#  5.0");
		p1.add("Java");// Stores duplicates
		p1.add("Python");
		
		// Display ArrayList contents as List
		System.out.println("Programming language ArrayList: "+p1);
		
		//Acces elements using get() method
		System.out.println("Element at index 1 is: "+p1.get(1));
		System.out.println("Does ArrayList contain element Java? :"+p1.contains("java"));//case sensitive
		
		//Add element at specific index
		p1.add(2,"Oracle");
		System.out.println("Programming language ArrayList: "+p1);
		
		//Manipulations
		System.out.println("Is ArrayList is Empty ? :"+p1.isEmpty());
		System.out.println("The Position of Python : "+p1.indexOf("Python"));
		System.out.println("The size of ArrayList is: "+p1.size());
		
		//create a ArrayList to store marks
		ArrayList<Integer> marks = new ArrayList<Integer>();
		marks.add(99);
		marks.add(88);
		marks.add(92);
		marks.add(56);
		// marks.add("Hello"); //Compiler Error - Type Safety

        System.out.println("The Marks ArrayList is :"+marks);
        System.out.println("The Size of Marks ArrayList is : "+marks.size());
        System.out.println("The Marks at 3rd index is : "+marks.get(3)); // AutoUnboxing - Convert Object to primitive type

        Collections.sort(marks);
        System.out.println("Marks ArrayList after Sorting :"+marks);

	}

}
