package com.moribenjamin.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.moribenjamin.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData () {
	
		
		//create employees
		Employee emp1 = new Employee(1,"Leslie", "Andrews", "leslie@luv2code.com");
		Employee emp2 = new Employee(2,"Emma", "Peel", "emma@luv2code.com");
		Employee emp3 = new Employee(3,"Bob", "Knob", "bob@luv2code.com");
		
		//create the list
		theEmployees = new ArrayList<>();
		
		//add to the list
		
		theEmployees.add(emp1);
		theEmployees.add(emp2);
		theEmployees.add(emp3);
	}
		
		//add Mapping for "/list"
		@GetMapping("/list")
		public String listEmployees (Model theModel) {
		
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
		
		
	}

}
