package com.test.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.test.pe.dao.AuditoryRepository;
import com.test.pe.domain.Auditory;
import com.test.pe.domain.exception.CustomHibernateException;

@Service
public class AuditoryServiceImpl implements  AuditoryService{

	@Autowired
	AuditoryRepository auditoryRepository;
	@Override
	public void add(Auditory auditory) throws CustomHibernateException {
		
		try {
			auditoryRepository.add(auditory);

		} catch (DataIntegrityViolationException e) {
			throw new CustomHibernateException("Registro Duplicado");
		}
	}

}
