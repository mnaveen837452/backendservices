package com.services.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@GetMapping("/sayhi")
	public String sayHi() {
		
		return "Hello, Welcome Naveen";
	}
	
	@GetMapping("sayBye")
	public String sayBye() {
		
		return "Bye Naveen, Have a nice day";
	}

}
