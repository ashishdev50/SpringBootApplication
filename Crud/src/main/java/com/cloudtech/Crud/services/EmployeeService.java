package com.cloudtech.Crud.services;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloudtech.Crud.entity.Employee;
import com.cloudtech.Crud.repositry.EmployeeRepositry;

//Bussiness logic will here
@Service
public class EmployeeService  {
	
	@Autowired
	private EmployeeRepositry  employeeRepositry;

/////////////////////////////////////////////////////////////	
	
	
	///////save/////
	public Employee save(Employee emp) {
		return employeeRepositry.save(emp);
		
	}
	
	//// for get//////
	public Employee getemployee(int id)
	{
	return	employeeRepositry.findById( id).get();
		
		
	}
	/////// for  update ////////
	public Employee updatemp(Employee employee)
	{
	Employee emp =	employeeRepositry.findById(employee.getId()).get();
	emp.setName(employee.getName());
	emp.setAge(employee.getAge());
 return	employeeRepositry.save(emp);
	}
	
	
	//////////for delete////////////
	
	public String delete(int id )
	{
		
		employeeRepositry.deleteById(id);
		return "Entriry deleted" + id;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/////////////////////////////////////////////////////
	
	
	public EmployeeRepositry getEmployeeRepositry() {
		return employeeRepositry;
	}

	public void setEmployeeRepositry(EmployeeRepositry employeeRepositry) {
		this.employeeRepositry = employeeRepositry;
	}
	
	
	
	

}
