package com.coforge.training.hibernateweb.model;

import jakarta.persistence.Entity;

/**
 *Author :Sola.Sri
 *Date   :Sep 25, 2025
 *Time   :4:47:35 PM
 *Project:hibernate-web
*/
@Entity
public class CurrentAccount  extends Account{
	private double overdraftLimit;

	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	
	

}
