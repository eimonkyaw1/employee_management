package com.spring.emk.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.spring.emk.model.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
