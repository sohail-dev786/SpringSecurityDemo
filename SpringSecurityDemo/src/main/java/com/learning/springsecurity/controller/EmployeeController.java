package com.learning.springsecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.learning.springsecurity.models.Employee;
import com.learning.springsecurity.services.IEmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	IEmployeeDao empDao;
	
	
	@GetMapping("/")
	public String index()
	{
		
		List<Employee> employees=(List<Employee>)empDao.findAll();
		System.out.println(employees);
		return "index";
	}
	
	
	

	
}
