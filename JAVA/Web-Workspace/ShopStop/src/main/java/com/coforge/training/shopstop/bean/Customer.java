package com.coforge.training.shopstop.bean;
/**
 *Author :Sola.Sri
 *Date   :Sep 22, 2025
 *Time   :12:14:14 PM
 *Project:ShopStop
*/

public class Customer {
	private int customerId;
	private String firstName;
    private String lastName;
    private boolean goldCustomer;
	public Customer() {
		
	}
	public int getCustomerId() {
		return customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public boolean isGoldCustomer() {
		return goldCustomer;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGoldCustomer(boolean goldCustomer) {
		this.goldCustomer = goldCustomer;
	}
    
    

}
