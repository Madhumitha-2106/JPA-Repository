package com.example.demo.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.StudentInfo.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}
