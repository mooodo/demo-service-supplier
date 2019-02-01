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
		Supplier ibm = new Supplier("S0001","国际商用机器公司(IBM)");
		put(ibm);
		Supplier mg = new Supplier("S0002","上海晨光文具股份有限公司(M&G)");
		put(mg);
	}
	@Override
	protected void put(Supplier t) {
		map.put(t.getId(), t);
	}

}
