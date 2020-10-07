/* 
 * Created by 2019年1月6日
 */
package com.demo.supplier.dao;

import java.util.Collection;

import com.demo.supplier.entity.Supplier;

/**
 * The interface of supplier dao.
 * @author fangang
 */
public interface SupplierDao {
	/**
	 * insert a supplier
	 * @param supplier
	 */
	public void insertSupplier(Supplier supplier);
	/**
	 * update a supplier
	 * @param supplier
	 */
	public void updateSupplier(Supplier supplier);
	/**
	 * @param id
	 * @return
	 */
	public Supplier getSupplier(String id);
	
	/**
	 * @return
	 */
	public Collection<Supplier> listOfSuppliers();
}
