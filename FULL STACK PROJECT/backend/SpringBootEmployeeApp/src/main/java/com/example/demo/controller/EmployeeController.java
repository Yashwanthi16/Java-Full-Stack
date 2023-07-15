package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping()
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}	
	
	@PostMapping()
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeRepository.save(employee);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id){
		Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found with this id "+ id));
		return ResponseEntity.ok(employee);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employeeDetails,@PathVariable int id){
		Employee emp = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found with this id "+ id));
		
		emp.setFirstname(employeeDetails.getFirstname());
		emp.setLastname(employeeDetails.getLastname());
		emp.setEmail(employeeDetails.getEmail());

		employeeRepository.save(emp);
		//save checks if this id is present in the data or not, it is resent then it updates else it creates new record.
		
		return ResponseEntity.ok(emp);
	}
	
//	ResponseEntity<HttpStatus>: this usage is typically employed when you want to explicitly return a response with a specific HTTP status code, without including any response body data.
	@DeleteMapping("{id}")
	public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable int id){
		Employee employee = employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Employee not found with this id "+ id));
		employeeRepository.delete(employee);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
