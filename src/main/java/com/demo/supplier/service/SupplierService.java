/* 
 * Created by 2019年1月30日
 */
package com.demo.supplier.service;

import java.util.Collection;

import com.demo.supplier.entity.Supplier;

/**
 * The service of suppliers.
 * @author fangang
 */
public interface SupplierService {
	/**
	 * create a supplier
	 * @param supplier
	 */
	public void createSupplier(Supplier supplier);
	/**
	 * modify a certain supplier
	 * @param supplier
	 */
	public void modifySupplier(Supplier supplier);
	/**
	 * @param id
	 * @return the supplier
	 */
	public Supplier loadSupplier(String id);
	
	/**
	 * @return the list of suppliers
	 */
	public Collection<Supplier> listOfSuppliers();
}
