/*
 * Created by 2020-10-07 10:28:55 
 */
package com.demo.supplier.query.dao;

import java.util.Collection;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.demo.supplier.dao.impl.SupplierFactory;
import com.demo.support.dao.QueryDao;

/**
 * @author fangang
 */
@Repository
public class SupplierQueryDao implements QueryDao {
	private SupplierFactory factory = SupplierFactory.newInstance();
	@Override
	public Collection<?> query(Map<String, Object> params) {
		return factory.list();
	}

	@Override
	public long count(Map<String, Object> params) {
		return factory.list().size();
	}

	@Override
	public Map<String, Object> aggregate(Map<String, Object> params) {
		// TODO Auto-generated method stub
		return null;
	}

}
