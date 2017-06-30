package com.test.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pe.dao.EmployeeRepository;
import com.test.pe.domain.Employee;
import com.test.pe.domain.exception.CustomHibernateException;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeServiceImpl;
	
	@Override
	public List<Employee> getAll() throws CustomHibernateException{
		return employeeServiceImpl.getAll();
	}

}
