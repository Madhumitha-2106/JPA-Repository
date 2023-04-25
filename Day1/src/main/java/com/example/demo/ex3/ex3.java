package com.example.demo.ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ex3 {
 
	@Value("${carName}")
	public String name;
	@RequestMapping("/h")
	public String display() {
		return "car : "+name;
	}
}
