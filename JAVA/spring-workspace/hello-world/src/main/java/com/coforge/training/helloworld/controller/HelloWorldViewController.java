package com.coforge.training.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * Author : Sola.Sri
 * Date   : Sep 29, 2025
 * Time   : 3:09:26 PM
 *Project : hello-world
*/
@Controller
public class HelloWorldViewController {
	//open browser --http://localhost:8082/myweb/mohana
	@GetMapping("/mohana")
	public String getMethodName(Model m) {
		m.addAttribute("name", "Mohana");
		m.addAttribute("city", "Guntur");
		m.addAttribute("country", "India");
		m.addAttribute("hello", "Hello from Spring Boot using JSP Views");
		return "welcome"; //welcome.jsp
	}
	

}
