package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation/")
public class SubstractionController {
	
	@GetMapping("sub/{a1}/{a2}")
	public int getSubstraction(@PathVariable("a1") int a1,@PathVariable("a2") int a2) {
		return a1-a2;
	}
	
	
}

