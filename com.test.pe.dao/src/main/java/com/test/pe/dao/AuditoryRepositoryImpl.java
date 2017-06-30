package com.test.pe.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pe.dao.config.AbstractDataBase;
import com.test.pe.domain.Auditory;

@Repository
@Transactional
public class AuditoryRepositoryImpl implements AuditoryRepository {

	@Autowired
	AbstractDataBase<Auditory, Integer> repository;

	@Override
	public void add(Auditory auditory) {

		repository.add(auditory);

	}

}
