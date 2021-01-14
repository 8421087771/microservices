package com.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
	@RequestMapping("/emp")
	public class EmployeeController {

	@GetMapping("/msg")
	public String show() {
	return "Hello R-APP";
	}
	
}
