package oopsdemo1;

/**
 * Author  :Sola.Sri
 * Date    :Sep 3, 2025
 * Time    :10:53:05 AM  
 * project :CoreJava
*/

class Faculty
{
	int empId;
    String name;
    
    public void setData(int c,String d){//input
        this.empId=c;
       this.name=d;
     }
    
    public void showData(){ //output
        System.out.print("EmpId = "+empId + "  " + " Employee Name = "+name);
        System.out.println();
     }
}

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create array of faculty objects
		Faculty obj[] = new Faculty[5];
		 
		//initialize Faculty object
		for(int i=0;i<5;i++)
		{
			obj[i] = new Faculty();
		}
		
		//assign data to Faculty objects
		obj[0].setData(100, "James");
		obj[1].setData(101, "Gavin");
		obj[2].setData(102, "Navin");
		obj[3].setData(103, "Mary");
		obj[4].setData(104, "Mohana");
		
		//display Faculty Object Data
		System.out.println("************ Faculty Details*************");
		for(int i=0;i<5;i++)
		{
			obj[i].showData();
		}
		System.out.println("*****************************************");
	}

}
