package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.services.EmployeeService;

@SpringBootApplication
public class SpringBootSampleApplication {
	
	@Autowired
	EmployeeService empl;
	

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
		
	}
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
 
            empl.display();
 
        };
    }

}
