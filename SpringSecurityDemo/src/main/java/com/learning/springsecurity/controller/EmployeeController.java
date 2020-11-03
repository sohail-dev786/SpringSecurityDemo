package com.learning.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.springsecurity.services.IEmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	IEmployeeDao empDao;
	
	
	@GetMapping("/")
	public String index()
	{
		return "index";
	}
	
	
}
