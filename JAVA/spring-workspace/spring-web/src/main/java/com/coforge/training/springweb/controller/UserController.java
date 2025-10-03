package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Author : Sola.Sri
 * Date   : Sep 29, 2025
 * Time   : 10:28:36 AM
 *Project : spring-web
*/

@Controller
public class UserController {
	
	//ModelMap is a container to hold data with key/values representation
	@RequestMapping(value = "/user" , method = RequestMethod.GET)
	public String userInfo(ModelMap model)
	{
		model.addAttribute("user" , "Rod Jhonson");
		model.addAttribute("d" , new java.util.Date());
		return "user";
	}
	
	@RequestMapping("/spring")
	public String showSecond()
	{
		return "second"; //return  view
	}

}
