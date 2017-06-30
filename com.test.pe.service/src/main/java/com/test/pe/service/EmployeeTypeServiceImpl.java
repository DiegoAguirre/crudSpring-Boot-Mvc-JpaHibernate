package com.test.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pe.dao.EmployeeTypeRepository;
import com.test.pe.domain.EmployeeType;
import com.test.pe.domain.exception.CustomHibernateException;

@Service
public class EmployeeTypeServiceImpl implements EmployeeTypeService {

	@Autowired
	EmployeeTypeRepository employeeTypeServiceImpl;
	
	@Override
	public List<EmployeeType> getAll() throws CustomHibernateException{
		return employeeTypeServiceImpl.getAll();
	}

}
