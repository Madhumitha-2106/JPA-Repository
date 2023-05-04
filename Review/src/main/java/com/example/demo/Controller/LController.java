package com.example.demo.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.LModel;
import com.example.demo.Service.LService;

@RestController
@RequestMapping("/user")

public class LController {
	
	@Autowired
	private LService obj4;
	
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String>loginData)
	{
		String username=loginData.get("username");
		String password=loginData.get("password");
		String result=obj4.checkLogin(username,password);
		return result;	
	}
	@PostMapping("/add")
	public LModel AddUser(@RequestBody LModel c1)
	{
		return obj4.addUser(c1);
	}
	
	@GetMapping("/get")
	public List<LModel> listAll()
	{
		return obj4.getUser1();
	}
	
}
