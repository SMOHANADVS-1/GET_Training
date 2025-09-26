package com.coforge.training.hibernatedemo.model;
/**
 *Author :Sola.Sri
 *Date   :Sep 24, 2025
 *Time   :11:51:52 AM
 *Project:hibernate-demo
 *
 *Entity class for product using XML Configuration
*/

public class Product {
	private long pid;
    private String name;
    private String description;
    private float price;
    
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
    

}
