/*
 * Created by 2020-06-25 22:27:26 
 */
package com.demo.supplier.dao.impl;

import com.demo.supplier.entity.Supplier;
import com.demo.support.dao.GenericFactory;

/**
 * @author fangang
 */
public class SupplierFactory extends GenericFactory<Supplier> {
	private static SupplierFactory factory;
	public static synchronized SupplierFactory newInstance() {
		if(factory!=null) return factory;
		SupplierFactory instance = SupplierFactory.newInstance();
		instance.setClazz(Supplier.class);
		instance.initFactory("supplier.xml");
		factory = instance;
		return factory;
	}
}
