package com.sportyshoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sportyshoe.global.Globaldata;
import com.sportyshoe.repository.RoleRepository;
import com.sportyshoe.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	private  BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	
	@GetMapping("/login")
	public String login()
	{
		Globaldata.cart.clear();
		return "login";
	}
	
	
	@GetMapping("/register")
	public String registerGet()
	{
		return "register";
	}
}