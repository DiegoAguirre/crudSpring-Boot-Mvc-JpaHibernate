package com.test.pe.service;

import java.util.List;

import com.test.pe.domain.EmployeeType;
import com.test.pe.domain.exception.CustomHibernateException;

public interface EmployeeTypeService {

	List<EmployeeType> getAll() throws CustomHibernateException;
}
