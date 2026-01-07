package com.inventory.model;

public class GloceryProduct extends Product {

	public GloceryProduct(int productId, String productName, int price, String category) {
		super(productId, productName, price, category);
	}
	
	@Override
	public double calculateTax() {
		// 5 %
		return this.getPrice() * 0.05;
	}
}

