/*
 * Created by 2021-01-04 09:18:06 
 */
package com.demo.supplier.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.demo.supplier.dao.SupplierDao;
import com.demo.supplier.entity.Supplier;
import com.demo.support.dao.BasicRepository;

/**
 * @author fangang
 */
@Repository
public class SupplierRepository extends BasicRepository<Supplier, String> implements SupplierDao {

	public SupplierRepository() {
		setClazz(Supplier.class);
		initFactory("supplier.xml");
	}

	@Override
	public void insertSupplier(Supplier supplier) {
		super.save(supplier);
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		super.save(supplier);
	}

	@Override
	public Supplier getSupplier(String id) {
		return super.get(id);
	}

	@Override
	public Collection<Supplier> listOfSuppliers() {
		return super.list();
	}

}
