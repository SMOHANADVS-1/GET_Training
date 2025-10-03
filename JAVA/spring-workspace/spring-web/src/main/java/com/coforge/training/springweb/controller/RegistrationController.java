package com.coforge.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.coforge.training.springweb.model.User;

/**
 * Author : Sola.Sri
 * Date   : Sep 27, 2025
 * Time   : 3:47:55 PM
 *Project : spring-web
*/

@Controller
public class RegistrationController {
	//Load Registration Form
	@GetMapping("/register") //mapping names of method showRegistrationForm
	public String showRegistrationForm(Model theModel)
	{
		theModel.addAttribute("user",new User());
		return "register";  //return view+model  register.jsp
		
	}
	//Submit Registration Form
	
	@PostMapping("/saveUser")
	public String submitForm(@ModelAttribute("user") User user, Model model)
	{
		model.addAttribute("user", user); //Pass user to success page
		return "success"; // success.jsp //returns user object+success.jsp
	}
	//View Registration Form details

}
