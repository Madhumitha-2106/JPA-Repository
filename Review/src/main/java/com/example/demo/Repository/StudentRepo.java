package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.StudentModel;

public interface StudentRepo extends JpaRepository<StudentModel, Integer> {

}
