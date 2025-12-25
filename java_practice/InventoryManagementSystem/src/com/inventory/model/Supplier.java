package com.inventory.model;

public class Supplier {
	private int supplierId;
	private String supplierName;
	private String contactNumber;
	
	public Supplier(int supplierId, String supplierName, String contactNumber) {
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.contactNumber = contactNumber;
	}
	
	public int getSupplierId() {
		return this.supplierId;
	}
	
	public String getSupplierName() {
		return this.supplierName;
	}
	
	public String getContactNumber() {
		return this.contactNumber;
	}

}
