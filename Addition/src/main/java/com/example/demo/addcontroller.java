package com.example.demo;

//import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/operation/")
public class addcontroller {

	
	@GetMapping(value="/add/{no1}/{no2}")
	public int add(@PathVariable int no1,@PathVariable int no2)
	{
		return no1+no2;
	}
	
	@PostMapping(value="/add1")
	public int add1(@RequestBody Numbers num)
	{
		return num.getNo1()+num.getNo2();
	}
}