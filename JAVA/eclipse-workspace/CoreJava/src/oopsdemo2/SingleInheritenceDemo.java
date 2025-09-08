package oopsdemo2;

/**
 * Author  :Sola.Sri
 * Date    :Sep 3, 2025
 * Time    :4:30:31 PM  
 * project :CoreJava
*/

public class SingleInheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Developer d1 = new Developer(101," Mohana", "JDBC", "Satender Bank");//invoke derived class constructor
		Developer d2 = new Developer(105, "Rod Johnson", "Spring Framework", "Virgin Atlantic");
		
		d1.display();
		d1.displayDeveloperDetails();
		
		d2.display();
		d2.displayDeveloperDetails();
		
		Employee e1 = new Employee(106,"Mike");
		e1.display();


	}

}
