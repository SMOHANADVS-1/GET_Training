package mapsdemo;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Comparator interface is used to order the objects of user-defined classes.
 * It sorts based multiple attributes of the class.
 */

public class ComparatorDemo {

	public static void main(String[] args) {
		
		 ArrayList<Developer>  a1= new ArrayList<Developer>();
				
				Developer d1=new Developer(103,"Mike","Java");
				Developer d2=new Developer(105,"Mary","Dot Net");
				Developer d3=new Developer(101,"Ravi","Angular");
				Developer d4=new Developer(102,"Hary","Php");
				Developer d5=new Developer(104,"Navin","Oracle");
				Developer d6=new Developer(106,"MOHANA","C#");
				Developer d7=new Developer(107,"NIKITHA","C++");
				
				
				//adding developers to ArrayList
				a1.add(d1);a1.add(d2);a1.add(d3);a1.add(d4);a1.add(d5);a1.add(d6);a1.add(d7);
				
				System.out.println("-------- UnSorted-----------");
				for(Developer i:a1)
				{
					System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
				}
				
				// sort by Id
				Collections.sort(a1, new IdComparator()); // invoke compare method of IdComparator
				
				System.out.println("-------- Sort By Id-----------");
				for(Developer i:a1)
				{
					System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
				}
				
				//sort by Domain of developer
				Collections.sort(a1,new DomainComparator());
				
				System.out.println("-------- Sort By Domain-----------");
				for(Developer i:a1)
				{
					System.out.println(i.getId()+" "+i.getName()+" "+i.getDomain());
				}

	}

}
