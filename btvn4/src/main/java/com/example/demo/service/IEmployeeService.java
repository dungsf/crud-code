package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Employee;

public interface IEmployeeService {
	// them nv
	public Employee addEmployee(Employee employee);
	
	// chinh sua
	public Employee updateEmployee(long id, Employee employee);
	
	// xoa
	public boolean deleteEmployee(long id);
	
	//lay ra danh sach
	
	public List<Employee> getAllEmployee();
	
	// ham lay ra 1 nhan vien 
	public Employee  getOneEmployee(long id);
	

}
