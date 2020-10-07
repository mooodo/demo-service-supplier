/* 
 * Created by 2019年1月30日
 */
package com.demo.supplier.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.supplier.dao.SupplierDao;
import com.demo.supplier.entity.Supplier;
import com.demo.supplier.service.SupplierService;

/**
 * The implement of the supplier service.
 * @author fangang
 */
@Service("supplier")
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierDao dao;
	@Override
	public void createSupplier(Supplier supplier) {
		dao.insertSupplier(supplier);
	}
	@Override
	public void modifySupplier(Supplier supplier) {
		dao.updateSupplier(supplier);
	}
	@Override
	public Supplier loadSupplier(String id) {
		return dao.getSupplier(id);
	}
	@Override
	public Collection<Supplier> listOfSuppliers() {
		return dao.listOfSuppliers();
	}
}
