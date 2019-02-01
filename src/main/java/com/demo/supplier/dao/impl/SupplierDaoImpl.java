/* 
 * Created by 2019年1月6日
 */
package com.demo.supplier.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.supplier.dao.SupplierDao;
import com.demo.supplier.entity.Supplier;
import com.demo.supplier.repository.SupplierRepository;

/**
 * The implement of the supplier dao.
 * @author fangang
 */
@Repository("supplierDao")
public class SupplierDaoImpl implements SupplierDao {
	private SupplierRepository repository = SupplierRepository.getInstance();

	@Override
	public Supplier getSupplier(String id) {
		return repository.get(id);
	}

	@Override
	public List<Supplier> listOfSupplier() {
		return repository.list();
	}

}
