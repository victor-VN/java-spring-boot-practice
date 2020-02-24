package com.luv2code.springboot.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

//@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//http://localhost:8080/magic-api/employees?sort=lastName,desc
	
	//add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
