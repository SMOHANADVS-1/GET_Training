package java8features;
@FunctionalInterface
interface MyFI {
	public String sayHello(); //by default abstract
	//public String sayHello();

}

public class LamdaDemo1 
{
	public static void main(String[] args) {
		MyFI msg = () ->{ return "Hello World";}; //lambda expression
		MyFI msg1 = () ->{ return "java8 features";}; //lambda expression
		MyFI msg2 = () ->{ return "coforge";}; //lambda expression
		MyFI msg3 = () ->{ return "coforge technologies";}; //lambda expression
		
		System.out.println(msg.sayHello());
		System.out.println(msg1.sayHello());
		System.out.println(msg2.sayHello());
		System.out.println(msg3.sayHello());
		
	}
}