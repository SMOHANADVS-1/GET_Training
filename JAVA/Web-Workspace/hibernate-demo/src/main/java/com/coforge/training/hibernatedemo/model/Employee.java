package com.coforge.training.hibernatedemo.model;
/**
 *Author :Sola.Sri
 *Date   :Sep 23, 2025
 *Time   :4:36:21 PM
 *Project:hibernate-demo
 *
 * Model class for Employee entity to save employee details using Hibernate ORM Tool.
 * USING XML CONFIGURATION
*/

public class Employee {
	
	private int empId;
	private String firstname, lastname;
	private double basic;
	private String dept;
	private String email;
	public Employee() {
		super();
	}
	public Employee(int empId, String firstname, String lastname, double basic, String dept, String email) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.basic = basic;
		this.dept = dept;
		this.email = email;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
