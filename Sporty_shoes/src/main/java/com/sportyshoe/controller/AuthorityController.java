package com.sportyshoe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/home")
public class AuthorityController {

	// @GetMapping("/normal")
	public ResponseEntity<String> normalUser() {
		return ResponseEntity.ok("yes i am normal user");
	}

	// @GetMapping("/admin")
	public ResponseEntity<String> adminUser() {
		return ResponseEntity.ok("yes, i am admin user");
	}

	// @GetMapping("/public")
	public ResponseEntity<String> public_User() {
		return ResponseEntity.ok("yes I am public user");
	}

}
