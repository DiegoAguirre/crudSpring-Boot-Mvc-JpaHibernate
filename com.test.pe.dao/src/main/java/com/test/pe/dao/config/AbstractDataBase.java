package com.test.pe.dao.config;

import java.util.List;

import com.test.pe.domain.exception.CustomHibernateException;

public interface AbstractDataBase<T,Q> {

	List<T> getAll(String value);
	void add(T value);
	void delete(T value);
	void update(T value);
	T getById(T value,Q id);
}
