package oopsdemo4;

/**
 * Author  :Sola.Sri
 * Date    :Sep 5, 2025
 * Time    :4:22:58 PM  
 * project :CoreJava
*/

public class Doctor  extends HospitalStaff{
	private String specialization;

	public Doctor(String name, String id, String department, String specialization) {
		super(name, id, department);
		this.specialization = specialization;
	}

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		System.out.println(getName()+"is examining patients in the"+getDepartment()+"department("+specialization+").");		
	}
	public void prescribeMedication()
	{
		System.out.println(getName()+" is writing a prescription. ");
	}

	



}
