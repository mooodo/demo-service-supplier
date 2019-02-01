/* 
 * Created by 2019年1月30日
 */
package com.demo.supplier.service.impl;

import java.util.List;

import com.demo.supplier.dao.SupplierDao;
import com.demo.supplier.entity.Supplier;
import com.demo.supplier.service.SupplierService;

/**
 * The implement of the supplier service.
 * @author fangang
 */

public class SupplierServiceImpl implements SupplierService {
	private SupplierDao dao;
	/**
	 * @return the dao
	 */
	public SupplierDao getDao() {
		return dao;
	}
	/**
	 * @param dao the dao to set
	 */
	public void setDao(SupplierDao dao) {
		this.dao = dao;
	}
	@Override
	public Supplier loadSupplier(String id) {
		return dao.getSupplier(id);
	}
	@Override
	public List<Supplier> listOfSupplier() {
		return dao.listOfSupplier();
	}

}
