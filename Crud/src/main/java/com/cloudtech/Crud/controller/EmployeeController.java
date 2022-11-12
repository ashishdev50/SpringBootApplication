package com.cloudtech.Crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloudtech.Crud.entity.Employee;
import com.cloudtech.Crud.services.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public Employee addemp(@RequestBody Employee employee)

	{
		System.out.println(employee.getName());
		return employeeService.save(employee);

	}

	@GetMapping(path = "/{id}")
	public Employee getEmployee(@PathVariable int id) {

		System.out.println(employeeService.getemployee(id).getName());
		return employeeService.getemployee(id);
	}

	
	
	@PutMapping("/update")
	public Employee updateemployee(@RequestBody Employee employee)
	{
		System.out.println(employeeService.updatemp(employee).getName());
		return employeeService.updatemp(employee);
	}
	
	
	
	@DeleteMapping(path = "/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		
		System.out.println(id+"deletes");
	return	employeeService.delete(id);
	}
	
	
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

}
