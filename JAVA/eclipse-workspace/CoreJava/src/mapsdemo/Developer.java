package mapsdemo;

import java.util.Comparator;

public class Developer {
	int id;
	String name,domain;
	public Developer(int id, String name, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDomain() {
		return domain;
	}


}


//comparator interface is used to sort objects user defined class 
// based on multiple fields
/*Comparator interface is used to order the objects of user-defined classes.
* This interface is found in java.util package and contains two methods.
* 1. int compare(Object obj1, Object obj2) : This method is used to compare the two objects.
* It returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.
* 2. boolean equals(Object element) : This method is used to check whether the passed object is equal to the object or not.
* Note: It is not mandatory to override this method.
*/
class IdComparator implements Comparator<Developer>
{


	@Override
	public int compare(Developer o1, Developer o2) {
		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;

		if(d1.id==d2.id)
			return 0;
		else if (d1.id>d2.id)
			return 1;
		else
			return -1;
	}

}


//comparator interface is used to sort objects user defined class 
// based on multiple fields
class DomainComparator implements Comparator<Developer>
{

	@Override
	public int compare(Developer o1, Developer o2) {

		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;

		return d1.domain.compareTo(d2.domain);//compare Strings
	}

}
