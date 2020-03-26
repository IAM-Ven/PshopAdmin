package com.caueruleum.pshop.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController 
{
	
	@GetMapping("/")
	public String helloWorld() 
	{
		return "hello-world";
	}

}
