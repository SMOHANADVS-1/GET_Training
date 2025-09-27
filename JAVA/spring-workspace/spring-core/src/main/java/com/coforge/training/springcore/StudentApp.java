package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Student;

/**
 * Author : Sola.Sri
 * Date   : Sep 26, 2025
 * Time   : 4:23:06 PM
 *Project : spring-core
*/
public class StudentApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.xml");
		
		//Get the Student Bean from xml file
		Student s1 = (Student) context.getBean("student1");
		Student s2 = (Student) context.getBean("student2");
		Student s3 = (Student) context.getBean("student3");

		
		System.out.println("*************Student Details ********************");
		System.out.println(s1.getRollNo()+" "+s1.getName()+""+s1.getCollege()+" "+s1.getMarks());
		System.out.println(s2.getRollNo()+" "+s2.getName()+""+s2.getCollege()+" "+s2.getMarks());
		System.out.println(s3.getRollNo()+" "+s3.getName()+""+s3.getCollege()+" "+s3.getMarks());
		
		((ClassPathXmlApplicationContext) context).close();


	}

}
