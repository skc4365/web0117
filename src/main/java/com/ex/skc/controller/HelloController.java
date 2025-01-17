package com.ex.skc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String getMethodName() {
		return "hello docker 00";
	}

	@GetMapping("/a")
	public String getMethodName_a() {
		return "hello docker _aa";
	}

	@GetMapping("/b")
	public String getMethodName_b() {
		return "hello docker _bb";
	}

}
