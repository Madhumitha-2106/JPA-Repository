package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.StudentModel;
import com.example.demo.Service.StudentService;

@RestController

public class StudentController {
	@Autowired
	public StudentService obj2;
	
	@PostMapping("/info")
	public StudentModel addDetails(@RequestBody StudentModel obj3)
	{
		return obj2.saveInfo(obj3);
	}
	
	@GetMapping("/details")
	public List<StudentModel>getDetails()
	{
		return obj2.getInfo();
	}
	
	@PutMapping("updatedetails")
	public StudentModel updateDetails(@RequestBody StudentModel id)
	{
		return obj2.UpdateInfo(id);
	}
	
	@DeleteMapping("/deletedetails/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		obj2.deleteInfo(id);
		return "Student Id "+id+" is deleted";
	}
	
	@DeleteMapping("deleteByReq")
	public String deleteByRequestPara(@RequestParam("id")int id)
	{
		obj2.deleteInfo(id);
		return "Student Id "+id+" is deleted";
	}
	
}
