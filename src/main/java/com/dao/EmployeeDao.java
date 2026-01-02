package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	int insertEmployee(Employee e);
	
	int deleteEmployeeById(int id);
	
	Employee findEmployeeById(int id);
	
	List<Employee> findAllEmployee();
	
	void updateEmployee(Employee e);
}
