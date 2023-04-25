package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Iplmodel;
import com.example.demo.repository.Iplrepo;

@Service
public class Iplservice {
	
	@Autowired
	public Iplrepo irepo;
	
	//posting the information
	public Iplmodel saveInfo(Iplmodel im)
	{
		return irepo.save(im);
	}
	
	//getting the information
	public List<Iplmodel>getInfo()
	{
		return irepo.findAll();
	}

}
