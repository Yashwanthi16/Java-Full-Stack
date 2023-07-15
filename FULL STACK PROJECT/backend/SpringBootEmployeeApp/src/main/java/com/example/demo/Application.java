package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Employee employee = new Employee();
//		employee.setFirstname("Yashwanthi");
//		employee.setLastname("Dasari");
//		employee.setEmail("abc@gmail.com");
//		employeeRepository.save(employee);
//		
//		Employee employee2 = new Employee();
//		employee2.setFirstname("Sumedha");
//		employee2.setLastname("p");
//		employee2.setEmail("www@gmail.com");
//		employeeRepository.save(employee2);

	}

}
