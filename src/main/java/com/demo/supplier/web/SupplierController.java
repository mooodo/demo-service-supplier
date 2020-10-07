/* 
 * Created by 2019年1月31日
 */
package com.demo.supplier.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.supplier.entity.Supplier;
import com.demo.supplier.service.SupplierService;

/**
 * The orm controller for suppliers.
 * @author fangang
 */
@RestController
@RequestMapping("supplier")
public class SupplierController {
	@Autowired
	private SupplierService service;
	@PostMapping("add")
	public void add(Supplier supplier) {
		service.createSupplier(supplier);
	}
	@PostMapping("modify")
	public void modify(Supplier supplier) {
		service.modifySupplier(supplier);
	}
	@GetMapping("load")
	public Supplier load(String id) {
		return service.loadSupplier(id);
	}
	@GetMapping("list")
	public Collection<Supplier> list() {
		return service.listOfSuppliers();
	}
}
