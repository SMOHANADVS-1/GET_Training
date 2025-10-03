package com.coforge.training.producthive.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.coforge.training.producthive.model.Product;
import com.coforge.training.producthive.repository.ProductRepository;

/**
 * Author : Sola.Sri
 * Date   : Oct 1, 2025
 * Time   : 10:51:14 AM
 *Project : pms-restapi
*/
@Service
public class ProductService {
	
	private final ProductRepository prepo;
	//Constructor Injection - generate Constructor using fields

	public ProductService(ProductRepository prepo) {
		super();
		this.prepo = prepo; 
	}
	
	public Product saveProduct(Product p)
	{
		return prepo.save(p); //invokes pre-defined method save() of JPA Repository
	}
	
	public List<Product> listAll()
	{
		return prepo.findAll();//invokes pre-defined method findAll() of JPA Repository
	}
	
	// Optional return type is to handle Null Pointer Exception
	   public Optional<Product> getSingleProduct(long pid) {
		   return prepo.findById(pid);            //Invokes pre-defined method findById() of JPA repository
	   }
	   
	   public void deleteProduct(long pid) {
		   prepo.deleteById(pid); //Invokes pre-defined method deleteById() of JPA repository
	   }
	   
	   public List<Product> searchProductsByName(String name){
		   return prepo.findProductsByNameContainingIgnoreCase(name); //Invokes method with custom query
	   }
	

}
