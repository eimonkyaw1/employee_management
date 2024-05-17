package com.spring.emk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.emk.model.Employee;
import com.spring.emk.repo.EmployeeRepo;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@PostMapping("/")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee){
		
		return ResponseEntity.ok(employeeRepo.save(employee));
	}
	
	@GetMapping("/employees")
	public ResponseEntity<List<?>> getAllEmployee(){
		return ResponseEntity.ok(employeeRepo.findAll());
	}

}
