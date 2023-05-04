package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.OneModel;

public interface OneRepo extends JpaRepository<OneModel, Integer> {

}
