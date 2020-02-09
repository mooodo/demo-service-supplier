/* 
 * Created by 2019年1月6日
 */
package com.demo.supplier.repository;

import com.demo.supplier.entity.Supplier;

/**
 * 
 * @author fangang
 */
public class SupplierRepository extends AbstractRepository<Supplier> {
	private static SupplierRepository repository = null;
	protected SupplierRepository() {}
	public static SupplierRepository getInstance() {
		if(repository==null)
			repository = new SupplierRepository();
		return repository;
	}
	
	@Override
	protected void initialize() {
		Supplier ibm = new Supplier("20001","International Business Machines Corporation(IBM)","电子产品");
		put(ibm);
		Supplier mg = new Supplier("20002","上海晨光文具股份有限公司(M&G)","办公用品");
		put(mg);
	}
	@Override
	protected void put(Supplier t) {
		map.put(t.getId(), t);
	}

}
