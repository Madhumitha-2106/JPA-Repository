package com.example.demo.ex2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex2 {
	@Value("${carName:thar}")
    public String name;
	@GetMapping("/he")
	public String display() {
		return "car : "+name;
	}
	
}
