package com.example.demo;

import org.springframework.data.repository.CrudRepository;

//this is a separate interface for database operations
//this interface extends crudrepository which helps us to perform DB operationseasily in spring boot
//it's an interface yet we can create an object for it because everything is handled by springboot

public interface AlienRepository extends CrudRepository<Alien, Integer>{
	
}
