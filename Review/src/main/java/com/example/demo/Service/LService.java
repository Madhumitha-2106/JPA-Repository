package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.LModel;
import com.example.demo.Repository.LRepo;

@Service

public class LService {
	
	@Autowired
	public LRepo obj3;
	public String checkLogin(String username,String password)
	{
		LModel user=obj3.findByusername(username);
		if(user==null)
		{
			return "No user found";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}
	
	public List<LModel> getUser1()
	{
	  return obj3.findAll();
	}
	public LModel addUser(LModel cl)
	{
		return obj3.save(cl);
	}
	public List<LModel> getUser()
	{
		return obj3.findAll();
	}
}
