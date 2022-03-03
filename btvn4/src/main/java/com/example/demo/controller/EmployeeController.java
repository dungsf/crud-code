package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private IEmployeeService iEmployeeService;
	//test
	@GetMapping("/")
	public String test() {
		return "hien thi";
	}
		//api test
	@PostMapping("/add")
		Employee addEmployee(@RequestBody Employee employee) {
			return iEmployeeService.addEmployee(employee);
		}
		
		// api test update
		@PutMapping("/update")
		public Employee updateEmployee(@RequestParam("id") long id,@RequestBody Employee employee) {
			return iEmployeeService.updateEmployee(id, employee);
		}
		// test api delete
		@DeleteMapping("/delete{id}")
		public boolean deleteEmployee(@PathVariable("id") long id) {
			return iEmployeeService.deleteEmployee(id);
		}
		// lay ds api
		public List<Employee> getAllEmployee(){
			return iEmployeeService.getAllEmployee();
		}
		
		
	}

