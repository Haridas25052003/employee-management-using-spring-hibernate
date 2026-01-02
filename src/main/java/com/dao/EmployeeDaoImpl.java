package com.dao;

import java.util.List;

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
		return sf.getCurrentSession().createQuery("delete from Employee where id=:a")
				.setParameter("a", id)
				.executeUpdate();
	}

	@Override
	public Employee findEmployeeById(int id) {
		return sf.getCurrentSession().get(Employee.class, id);
	}

	@Override
	public List<Employee> findAllEmployee() {
		return sf.getCurrentSession().createCriteria(Employee.class)
				.list();
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().saveOrUpdate(e);
		
	}
	
	

}
