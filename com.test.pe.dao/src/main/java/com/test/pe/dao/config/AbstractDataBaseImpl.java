package com.test.pe.dao.config;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Repository;

import com.test.pe.domain.exception.CustomHibernateException;

@Repository
@Transactional
public class AbstractDataBaseImpl<T, Q> implements AbstractDataBase<T, Q> {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<T> getAll(String value) {
		Query query = entityManager.createQuery(" from " + value);
		List<T> result = (List<T>) query.getResultList();
		return result;
	}

	@Override
	public void add(T value) {
		entityManager.persist(value);
	}

	@Override
	public void delete(T value) {
		if (entityManager.contains(value))
			entityManager.remove(value);
		else
			entityManager.remove(entityManager.merge(value));
	}

	@Override
	public void update(T value) {
		entityManager.merge(value);
	}

	@Override
	public T getById(T value, Q id) {
		return (T) entityManager.find(value.getClass(), id);
	}

}
