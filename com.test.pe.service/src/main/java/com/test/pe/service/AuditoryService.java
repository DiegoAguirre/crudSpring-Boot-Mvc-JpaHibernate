package com.test.pe.service;

import com.test.pe.domain.Auditory;
import com.test.pe.domain.exception.CustomHibernateException;

public interface AuditoryService {

	void add(Auditory auditory) throws CustomHibernateException;
}
