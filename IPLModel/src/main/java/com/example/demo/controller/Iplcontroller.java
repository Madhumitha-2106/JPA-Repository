package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Iplmodel;
import com.example.demo.service.Iplservice;

@RestController
public class Iplcontroller {
	
	@Autowired
	
	public Iplservice iser;
	
	@PostMapping("/saveipl")
	
	public Iplmodel addDetails( Iplmodel obj)
	{
		return iser.saveInfo(obj);
	}
	
	@GetMapping("/getipl")
	
	public List<Iplmodel> getDetails()
	{
		return iser.getInfo();
	}
	

}
