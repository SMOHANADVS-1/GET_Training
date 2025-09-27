package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Author : Sola.Sri
 * Date   : Sep 27, 2025
 * Time   : 2:30:40 PM
 *Project : spring-web
 */
@Controller
public class HelloWorldController { 

	/* Work Flow of Spring MVC Application
	 * 
	 *   Client --> Request(index.jsp) --> FrontController(Web.xml) 
	 *       -->Controller(HelloWorldController) ---> response(hello.jsp) 
	 * 
	 */

	@GetMapping("/mohana")//Mapping URL of the request to the method

	public String sayHello() {
		return "hello"; //returns hello.jsp
	}

	@GetMapping("/noida")//Mapping URL of the request to the method

	public String sayHello1() {
		return "noida"; //returns hello.jsp
	}

}
