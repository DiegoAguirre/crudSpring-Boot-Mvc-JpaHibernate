package com.test.pe.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pe.dao.config.AbstractDataBase;
import com.test.pe.domain.Employee;

@Repository
@Transactional
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	AbstractDataBase<Employee, Integer> repository;
	
	@Override
	public List<Employee> getAll()  {
		return repository.getAll(Employee.class.getName());
	}

}
