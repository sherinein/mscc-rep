package com.demo.javaprj.day4;

public class Product {

	 private long id;
	 private String productName; 
	 private String supplierName;
	 private int year;
	 
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(long id, String productName, String supplierName, int year) {
		super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
		this.year = year;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	 

}
