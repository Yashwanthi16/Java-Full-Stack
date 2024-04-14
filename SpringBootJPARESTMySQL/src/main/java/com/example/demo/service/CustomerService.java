package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.customerRepo;

@Service
public class CustomerService {

    @Autowired
    private customerRepo customerRepository;

    public Customer getCustomerById(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    // Custom query method to find customers sorted by name
    public List<Customer> getCustomersSortedByName() {
        return customerRepository.findByOrderBynameAsc();
    }
}
