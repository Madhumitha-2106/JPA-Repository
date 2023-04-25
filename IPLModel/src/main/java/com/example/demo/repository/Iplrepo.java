package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Iplmodel;

public interface Iplrepo extends JpaRepository<Iplmodel, Integer> 
{

}
