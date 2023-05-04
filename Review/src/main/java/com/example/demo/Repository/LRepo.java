package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.LModel;

public interface LRepo extends JpaRepository<LModel, Integer> {
	LModel findByusername(String username);

}
