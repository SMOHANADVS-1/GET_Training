package java8features;

/**
 * Author  :Sola.Sri
 * Date    :Sep 11, 2025
 * Time    :2:17:55 PM  
 * project :AdvancedJavaProject
*/

public class LambdaDemo2 {

	public static void main(String[] args) {
		NumericTest isEven = (n) -> (n%2==0);
		NumericTest isNegative = (n) -> (n<0);
		
		System.out.println("7 is even number : "+isEven.computeTest(7));
		System.out.println("-55 is Negative number : "+isNegative.computeTest(7));
		//boolean a=(n) -> (n%2==0); //error lamdaexpression should be stored in instance of FI

	}

}
