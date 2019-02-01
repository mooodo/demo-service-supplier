/* 
 * Created by 2019年1月6日
 */
package com.demo.supplier.dao;

import java.util.List;

import com.demo.supplier.entity.Supplier;

/**
 * 
 * @author fangang
 */
public interface SupplierDao {
	/**
	 * @param id
	 * @return
	 */
	public Supplier getSupplier(String id);
	
	/**
	 * @return
	 */
	public List<Supplier> listOfSupplier();
}
