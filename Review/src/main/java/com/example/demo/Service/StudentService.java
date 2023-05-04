package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.StudentModel;
import com.example.demo.Repository.StudentRepo;

@Service

public class StudentService {
	
	@Autowired
	public StudentRepo obj;
	
	//post 
	public StudentModel saveInfo(@RequestBody StudentModel obj1)
	{
		return obj.save(obj1);
	}
	//get
	public List<StudentModel> getInfo()
	{
		return obj.findAll();
	}
	//put
	public StudentModel UpdateInfo(StudentModel in)
	{
		return obj.saveAndFlush(in);
	}
	//delete
	public void deleteInfo(int id)
	{
		obj.deleteById(id);
	}
	//sorting
	public List<StudentModel> sortDesc(String name)
	{
		return obj.findAll(Sort.by(name).descending());
	}
	public List<StudentModel> sortAsc(String name)
	{
		return obj.findAll(Sort.by(name).ascending());
	}
	//pagination
	public List<StudentModel> paginationData(int pageNum,int pagesize)
	{
		Page<StudentModel>p = obj.findAll(PageRequest.of(pageNum, pagesize));
		return p.getContent();
	}
}
