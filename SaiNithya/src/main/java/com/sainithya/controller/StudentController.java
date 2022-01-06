package com.sainithya.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@PostMapping("/")
	public  String Hi() {
		return "Hello";
	}

}
