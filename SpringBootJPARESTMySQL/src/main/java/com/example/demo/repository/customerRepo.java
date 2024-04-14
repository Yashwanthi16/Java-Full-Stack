package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Customer;

import java.util.List;

public interface customerRepo extends JpaRepository<Customer, Long> {

    // Custom query method to find customers sorted by name
    @Query("SELECT c FROM Customer c ORDER BY c.name ASC")
    List<Customer> findByOrderBynameAsc();
}