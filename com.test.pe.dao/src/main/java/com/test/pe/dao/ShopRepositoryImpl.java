package com.test.pe.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.pe.dao.config.AbstractDataBase;
import com.test.pe.domain.Shop;

@Repository
@Transactional
public class ShopRepositoryImpl implements ShopRepository{

	@Autowired
	AbstractDataBase<Shop , Integer> repository;
	
	@Override
	public List<Shop> getAll() {
		return repository.getAll(Shop.class.getName());
	}

}
