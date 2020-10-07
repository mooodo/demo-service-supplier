/* 
 * Created by 2019年1月6日
 */
package com.demo.supplier.dao.impl;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.demo.supplier.dao.SupplierDao;
import com.demo.supplier.entity.Supplier;

/**
 * The implement of the supplier dao.
 * @author fangang
 */
@Repository()
public class SupplierDaoImpl implements SupplierDao {
	private SupplierFactory factory = SupplierFactory.newInstance();

	@Override
	public void insertSupplier(Supplier supplier) {
		factory.save(supplier);
	}

	@Override
	public void updateSupplier(Supplier supplier) {
		factory.save(supplier);
	}
	@Override
	public Supplier getSupplier(String id) {
		return factory.get(id);
	}

	@Override
	public Collection<Supplier> listOfSuppliers() {
		return factory.list();
	}

}
