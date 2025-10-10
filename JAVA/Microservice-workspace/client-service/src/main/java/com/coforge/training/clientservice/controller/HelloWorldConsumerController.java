package com.coforge.training.clientservice.controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.training.helloservice.model.Employee;

@RestController
public class HelloWorldConsumerController {
	
	//instance of feign - Micro services communication
	private final HelloClient helloClient;

	//DI using cONSTRUCTORS
	public HelloWorldConsumerController(HelloClient helloClient) {
		super();
		this.helloClient = helloClient;
	}
	
	
	@GetMapping("/get-hello")
	public String getMethodName()
	{
		return helloClient.getHello();
	}
	
	
	
	@GetMapping("/get-employees")
	public List<Employee> getEmployees()
	{
		return helloClient.getEmployees();
	}
	
	
	

}
