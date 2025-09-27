package com.coforge.training.springcore;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.training.springcore.model.Product;

/**
 * Author : Sola.Sri
 * Date   : Sep 27, 2025
 * Time   : 10:23:35 AM
 *Project : spring-core
 *Spring configuration class for annotations
*/

@Configuration//conffiguration for java bean objects
@ComponentScan(basePackages = "com.coforge.training.springcore.model")
public class ProductConfig {
	
	@Bean
	public Product product1() {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(85000.00);
        return product;
    }
	
	@Bean
	public Product product2() {
        Product product = new Product();
        product.setName("Mobile");
        product.setPrice(15000.00);
        return product;
    }
	
	@Bean
	public Product product3() {
        Product product = new Product();
        product.setName("Tablet");
        product.setPrice(18000.00);
        return product;
    }
	
	

}
