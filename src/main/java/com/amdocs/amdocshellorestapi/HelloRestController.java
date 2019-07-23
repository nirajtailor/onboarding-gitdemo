package com.amdocs.amdocshellorestapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("./")
public class HelloRestController{
	@GetMapping("hello")
	public String sayHello() {
		return "Hello all i am Rest API.";
	}
}
