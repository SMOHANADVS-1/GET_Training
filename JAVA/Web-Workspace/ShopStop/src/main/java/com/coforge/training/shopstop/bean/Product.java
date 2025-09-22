package com.coforge.training.shopstop.bean;
/**
 *Author :Sola.Sri
 *Date   :Sep 22, 2025
 *Time   :12:22:43 PM
 *Project:ShopStop
 */
//JAVA BEAN CLASS-POJO
public class Product {
	//Properties
	private int pId;
	private String pName;
	private double price;

	public Product() {

	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public double getPrice() {
		return price;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(double price) {
		this.price = price;
	}



}
