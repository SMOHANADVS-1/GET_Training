package streamsdemo;

/**
 * Author  :Sola.Sri
 * Date    :Sep 12, 2025
 * Time    :10:57:53 AM  
 * project :AdvancedJavaProject
*/

public class Employee {

	private int salary;
    private String name;
	public Employee(String name, int salary) {
		this.salary = salary;
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
