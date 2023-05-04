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
import com.example.demo.Repository.StudentRepo;
import com.example.demo.Service.StudentService;

import io.swagger.v3.oas.annotations.tags.Tag;

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
	
	@PutMapping("/updatedetails")
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
	
	@DeleteMapping("/deleteByReq")
	public String deleteByRequestParam(@RequestParam("id") int id)
	{
		obj2.deleteInfo(id);
		return "Student Id "+id+" is deleted";
	}
	@GetMapping("/sortDesc/{name}")
	public List<StudentModel> sortName(@PathVariable("name")String name)
	{
		return obj2.sortDesc(name);
	}
	@GetMapping("/sortAsc/{name}")
	public List<StudentModel> sort(@PathVariable("name")String name)
	{
		return obj2.sortAsc(name);
	}
	//pagination
	@GetMapping("/pagination/{pnu}/{psize}")
	public List<StudentModel>paginationData(@PathVariable("pnu") int pnu,@PathVariable("psize")int psize)
	{
		return obj2.paginationData(pnu, psize);
	}
	
	@Autowired
	public StudentRepo sr;
	
	//GETTING DETAILS
	
	@Tag( name="Native query",description="Getting details")
	@GetMapping("/saveStudent")
	public List<StudentModel> getD()
	{
		return sr.getAllData();
	}
	
	@Tag( name="Native query",description="Getting details by id")
	@GetMapping("byName/{id}")
	public List<StudentModel> getName(@PathVariable ("id") int pid )
	{
		return sr.byid(pid);
	}

	@Tag( name="Native query",description="Getting details by start end method")
	@GetMapping("startend/{start}/{end}")
	public List<StudentModel> getStart(@PathVariable ("start")int start,@PathVariable ("end")int end)
	{
		return sr.startEnd(start, end);
	}
	
	@Tag( name="JPQL",description="Getting details by methods")
	@GetMapping("jp")
	public List<StudentModel>jplQuery()
	{
		return sr.jpqlQ();
	}
	
	//DELETING
	
	@Tag( name="Native query",description="Deleting details by id and name")
	@DeleteMapping("/del/{id}/{name}")
	public String delD(@PathVariable ("id") int id,@PathVariable ("name")String name)
	{
		sr.deleteD(id, name);
		return "deleted";
	}

	//POSTING

	@Tag( name="Native query",description="Posting details")
	@PutMapping("updatee/{pid}/{pname}")
	public void updateQue(@PathVariable("pid")int pid,@PathVariable("pname") String pname)
	{
		sr.updateByQuery(pid, pname);
	}
}
	

