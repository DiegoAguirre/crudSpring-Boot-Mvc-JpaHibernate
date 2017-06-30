package com.test.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.pe.dao.ShopRepository;
import com.test.pe.domain.Shop;
import com.test.pe.domain.exception.CustomHibernateException;

@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	ShopRepository shopRepository;
	
	@Override
	public List<Shop> getAll() throws CustomHibernateException{
		return shopRepository.getAll();
	}

}
