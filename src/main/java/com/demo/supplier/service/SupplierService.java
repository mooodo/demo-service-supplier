/* 
 * Created by 2019年1月30日
 */
package com.demo.supplier.service;

import java.util.List;

import com.demo.supplier.entity.Supplier;

/**
 * The service of suppliers.
 * @author fangang
 */
public interface SupplierService {
	/**
	 * @param id
	 * @return the supplier
	 */
	public Supplier loadSupplier(String id);
	
	/**
	 * @return the list of supplier
	 */
	public List<Supplier> listOfSupplier();
}
