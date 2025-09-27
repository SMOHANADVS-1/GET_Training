package com.coforge.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.training.springcore.model.Person;

/**
 * Author : Sola.Sri
 * Date   : Sep 27, 2025
 * Time   : 10:46:43 AM
 *Project : spring-core
*/
public class PersonApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("PersonConfig.xml");

		//Get the Book Bean/Object from xml file
		Person p1=(Person) context.getBean("person1");
		Person p2=(Person) context.getBean("person2");
		Person p3=(Person) context.getBean("person3");
		
		p1.display();		
		p2.display();		
		p3.display();		
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
