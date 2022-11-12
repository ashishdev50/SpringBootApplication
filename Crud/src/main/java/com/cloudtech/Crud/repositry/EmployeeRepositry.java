package com.cloudtech.Crud.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cloudtech.Crud.entity.Employee;

@Repository
public interface EmployeeRepositry  extends JpaRepository<Employee, Integer>{

}
