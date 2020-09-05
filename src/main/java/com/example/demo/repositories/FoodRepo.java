package com.example.demo.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.FoodModel;

public interface FoodRepo extends CrudRepository<FoodModel, Integer>{
	
	

}
