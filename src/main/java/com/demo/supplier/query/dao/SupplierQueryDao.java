/*
 * Created by 2020-10-07 10:28:55 
 */
package com.demo.supplier.query.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.supplier.dao.impl.SupplierRepository;
import com.demo.support.dao.QueryDao;

/**
 * @author fangang
 */
@Repository
public class SupplierQueryDao implements QueryDao {
	@Autowired
	private SupplierRepository repository;
	@Override
	public Collection<?> query(Map<String, Object> params) {
		return repository.list();
	}

	@Override
	public long count(Map<String, Object> params) {
		return repository.list().size();
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
