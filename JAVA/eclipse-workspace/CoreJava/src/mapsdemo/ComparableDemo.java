package mapsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(111,"John",29));
		al.add(new Student(222,"Mike",21));
		al.add(new Student(333,"Mary",26));
		al.add(new Student(444,"Mohana",22));
		al.add(new Student(555,"nikitha",22));
		System.out.println("************* Student Details **********");
		for (Student st : al) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
			
		}
		
		System.out.println("************* Student Sorted based on Age **********");
		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.getRollno()+" "+st.getName()+" "+st.getAge());
			
		}

	}

}
