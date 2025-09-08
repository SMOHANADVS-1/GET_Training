package exceptionsdemo;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :2:35:55 PM  
 * project :CoreJava
*/
/* Java program for General Exception Handling */
public class ArraysTest {

	public static void main(String[] args) {
		
				String[] languages = {"C","C++","Java","Perl","Python"};

		        try {
		            for (int i = 0; i <= languages.length; i++) {
		            System.out.println(languages[i]);
		                }
		            }
		        catch (Exception e){
		            e.printStackTrace();
		        }
		        finally {
		            System.out.println("In Finally Block");
		        }
	}

}
