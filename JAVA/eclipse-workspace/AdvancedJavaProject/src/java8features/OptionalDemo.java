package java8features;

import java.util.Optional;

/**
 * Author  :Sola.Sri
 * Date    :Sep 11, 2025
 * Time    :4:45:48 PM  
 * project :AdvancedJavaProject
*/

//Optional class is added in Java 8 to handle null values 
//to avoid Null Pointer Exception



public class OptionalDemo {

	public static void main(String[] args) {
//		
//		 String s=null; Integer a=null;
//		 
//		 System.out.println(s.length());
		 // throw Null Pointer Exception
		
		//String s="Hello World";
		String s=null;
		
		//Optional object is a container for not null objects
		Optional<String> chkNull=Optional.ofNullable(s);
		
		if(chkNull.isPresent())
		{
			System.out.println("Length of String is : "+s.length());
			chkNull.ifPresent(System.out::println);
			System.out.println(s.toUpperCase());
			System.out.println(chkNull.get());
		}
		else
		{
			System.out.println("String not Present");
		}
	}

}
