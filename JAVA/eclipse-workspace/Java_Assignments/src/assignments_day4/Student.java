package assignments_day4;

import java.util.Scanner;

/**
 *Author :Sola.Sri
 *Date   :Sep 24, 2025
 *Time   :3:12:57 PM
 *Project:Java_Assignments
*/
class StudentDetails
{
	String name;
	String yoj;
	double marks;
	
	public StudentDetails(String name, String yoj, double marks) {
		super();
		this.name = name;
		this.yoj = yoj;
		this.marks = marks;
	}
	
	public  void display() {
	
	System.out.println("Student Name: "+this.name+" Year Of Joining: "+this.yoj+ " marks: "+this.marks);
	}
	
	
}
public class Student {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter student name: ");
        String studentName = s.next();
        
        System.out.print("Enter year of joining: ");
        String yearOfJoining = s.next();
        
        System.out.print("Enter marks: ");
        double studentMarks = s.nextDouble();
        // Create the object and pass the user input to the parameterized constructor
        StudentDetails sd = new StudentDetails(studentName, yearOfJoining, studentMarks);
        
        // Call the method to display the object's details
        sd.display();
        
        s.close();
        
        
		
		

	}

}
