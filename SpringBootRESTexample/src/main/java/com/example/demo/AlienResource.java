package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource {
	
	@Autowired
	AlienRepository repo;
	
	//for get, instead of using request mapping, we can use getMapping
	@GetMapping("aliens")
	public List<Alien> getAlien(){
		
		//whatever objects we are dealing with, the corresponding class should be marked as entity.
		//table name will be taken as classname unless until it is specified with @Tablename annotation
		List<Alien> aliens = (List<Alien>) repo.findAll();
		return aliens;	
	}
}
