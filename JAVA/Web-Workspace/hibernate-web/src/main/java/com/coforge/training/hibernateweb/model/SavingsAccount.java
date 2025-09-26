package com.coforge.training.hibernateweb.model;

import jakarta.persistence.Entity;

/**
 *Author :Sola.Sri
 *Date   :Sep 25, 2025
 *Time   :4:45:29 PM
 *Project:hibernate-web
*/
@Entity
public class SavingsAccount extends Account {
	
	private double interestRate;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}
