package com.mkpits.spring.SpringApplicationDemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MySpringController {
	
	int number1=10;
	int number2=20;
	@Value("${my.name}")
	private String name;
	@GetMapping("/name")
	private String getName()
	{
		
		return "Name :- "+name;
	}
	
	@GetMapping("/add")
	private int addValue(int number1, int number2) {
		return number1+number2;
		
		
	}
	
	

}
