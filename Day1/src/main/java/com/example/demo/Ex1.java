package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ex1 {
	
	public String name="Abinaya";
	@GetMapping("/hello")
	public String display()
	{
		return "hello "+name;
	}

}
