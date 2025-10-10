
/**
 * Author : Sola.Sri
 * Date   : Oct 9, 2025
 * Time   : 9:33:15 AM
 *Project : bus-reservation
*/
package com.coforge.project.busreservation.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.*;


@Entity
@Table(name="admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@SequenceGenerator(initialValue = 1,allocationSize = 1)
	@Column(name = "adminid")
	private Long id;
	
	@Column(name = "first_name",nullable = false)
	private String fname;
	
	@Column(name = "last_name",nullable = false)
	private String lname;
	
	@Column(unique = true,nullable = false)
	private String email;
	
	@NotBlank(message = "Password cannot be blank")
	@Size(min = 8,max = 255,message = "Password must be between 8 and 255 characters")
	@Column(name = "password", nullable = false)
	private String password;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(Long id, String fname, String lname, String email, String password) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}