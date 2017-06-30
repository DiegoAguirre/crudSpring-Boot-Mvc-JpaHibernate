package com.test.pe.service;

import java.util.List;

import com.test.pe.domain.Employee;
import com.test.pe.domain.exception.CustomHibernateException;

public interface EmployeeService {

	List<Employee> getAll() throws CustomHibernateException;
}
