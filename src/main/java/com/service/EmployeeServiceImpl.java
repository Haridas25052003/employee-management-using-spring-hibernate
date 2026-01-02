package com.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.EmployeeDao;
import com.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao ed;
	
	public int insertEmployee(Employee e) {
		return ed.insertEmployee(e);
	}

	public int deleteEmployeeById(int id) {
		return ed.deleteEmployeeById(id);
		
	}

	@Override
	public Employee findEmployeeById(int id) {
		return ed.findEmployeeById(id);
	}

	@Override
	public List<Employee> findAllEmployee() {
		return ed.findAllEmployee();
	}
	
	
}
