/* 
 * Created by 2018年9月9日
 */
package com.demo.supplier.entity;

/**
 * 
 * @author fangang
 */
public class Supplier {
	private String id;
	private String name;
	private String classify;
	
	public Supplier() {}
	public Supplier(String id, String name, String classify) {
		this.id = id;
		this.name = name;
		this.classify = classify;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the classify
	 */
	public String getClassify() {
		return classify;
	}
	/**
	 * @param classify the classify to set
	 */
	public void setClassify(String classify) {
		this.classify = classify;
	}
	
}
