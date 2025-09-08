package oopsdemo4;

/**
 * Author  :Sola.Sri
 * Date    :Sep 6, 2025
 * Time    :11:45:33 AM  
 * project :CoreJava
*/
//class for multiple inheritance
public class Result extends Candidate implements Exam
{
		/*String name;
		int roll_no,mark1,mark2;*/
	
	  public Result(String name, int roll_no, int mark1, int mark2) {
			super(name, roll_no, mark1, mark2);
			System.out.println("Candidate Result ****************");
		}
	/*  void display()
		{
			System.out.println ("Name of Student: "+name);
			System.out.println ("Roll No. of Student: "+roll_no);
			System.out.println ("Marks of Subject 1: "+mark1);
			System.out.println ("Marks of Subject 2: "+mark2);
		}*/
	  @Override
	  public void percent_cal() {
		int total=(mark1+mark2);
		float percent=total*100/200;
		System.out.println ("Percentage: "+percent+"%");

	  }

}
