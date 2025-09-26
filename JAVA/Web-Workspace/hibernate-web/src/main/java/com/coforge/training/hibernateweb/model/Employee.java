package com.coforge.training.hibernateweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *Author :Sola.Sri
 *Date   :Sep 25, 2025
 *Time   :12:11:46 PM
 *Project:hibernate-web
 *
 *	/*
	 * Model class created using Annotation Configuration
	 */
@Entity
@Table(name = "employees")

public class Employee {

	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	   private Long id;

	    private String name;
	    private String department;
	    private Double salary;
		public Employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		public Double getSalary() {
			return salary;
		}
		public void setSalary(Double salary) {
			this.salary = salary;
		}
	    
	    
	    
	    
	    

}
