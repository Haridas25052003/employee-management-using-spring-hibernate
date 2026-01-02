package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	private SessionFactory sf;
	
	public int insertEmployee(Employee e) {
		return (int) sf.getCurrentSession().save(e);
	}
	
	public int deleteEmployeeById(int id) {
		return sf.getCurrentSession().createQuery("delete from employee where id:a")
				.setParameter("a", id)
				.executeUpdate();
	}

}
