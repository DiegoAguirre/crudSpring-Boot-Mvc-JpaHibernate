package com.test.pe.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pe.dao.config.AbstractDataBase;
import com.test.pe.domain.EmployeeType;

@Repository
@Transactional
public class EmployeeTypeRepositoryImpl implements EmployeeTypeRepository {

	@Autowired
	private AbstractDataBase<EmployeeType,Integer> repository;

	@Override
	public List<EmployeeType> getAll() {
		
		return repository.getAll(EmployeeType.class.getName());
	}

}
