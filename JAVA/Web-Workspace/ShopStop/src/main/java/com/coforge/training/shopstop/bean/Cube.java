package com.coforge.training.shopstop.bean;
/**
 *Author :Sola.Sri
 *Date   :Sep 22, 2025
 *Time   :11:47:07 AM
 *Project:ShopStop
*/

public class Cube {

	private int num;
	//generate constructor with no arg --default  constructor
	public Cube() {
		
	}
	public int getNum() {
		return num*num*num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	

}
