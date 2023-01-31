package com.example.demo.model;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface AlienRepo extends CrudRepository<Alien, Integer>{
	
	//we can write user-defined signatures here to perform more database operations
	List<Alien> findByTech(String tech);
	
	List<Alien> findByAidGreaterThan(int aid);
	
	//jpql query
	@Query("from Alien where tech=?1 order by aname")
	List<Alien> findByTechSorted(String tech1);
}
