package com.inventory.model;

public class Product {
	// encapsulation
	private int productId;
	private String productName;
	private double price;
	private String category;
	
	public Product(int productId, String productName, double price, String category) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	
//	controlled Access
	public int getProductId() {
		return this.productId;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	
	
}
