package com.test.pe.service;

import java.util.List;

import com.test.pe.domain.Shop;
import com.test.pe.domain.exception.CustomHibernateException;

public interface ShopService {

	List<Shop> getAll() throws CustomHibernateException;
}
