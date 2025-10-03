package com.coforge.training.producthive.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.producthive.model.Dealer;

/**
 * Author : Sola.Sri
 * Date   : Oct 3, 2025
 * Time   : 2:51:27 PM
 *Project : pms-restapi
*/

//Repository for Dealer Registration & Login Module with Custom Methods

public interface DealerRepository  extends JpaRepository<Dealer, Long>{
	
	//By default JpaREPOSITORY HAS  pre-defined methods for CRUD Operations
	//to fetch records based on primary-key field -- findById()
	
	//Custom methods -- to fetch a record/object based on nonId field -email
	public Optional<Dealer> findByEmail(String email);
	
	//To fetch a record/object based on lname field -nonId field
	
	public List<Dealer> findByLname(String lname);

}
