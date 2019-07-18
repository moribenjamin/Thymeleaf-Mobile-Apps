package com.moribenjamin.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moribenjamin.thymeleafdemo.entity.Employee;
import com.moribenjamin.thymeleafdemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService theEmployeeService) {
		employeeService = theEmployeeService;
	}
		
		//add Mapping for "/list"
		@GetMapping("/list")
		public String listEmployees (Model theModel) {
			
		//get employees from db
			List<Employee> theEmployees = employeeService.findAll();
			
			theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
		
		
	}

}
