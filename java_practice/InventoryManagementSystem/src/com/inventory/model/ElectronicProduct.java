package com.inventory.model;

public class ElectronicProduct extends Product {

	public ElectronicProduct(int productId, String productName, int price, String category) {
		super(productId, productName, price, category);
	}
	
	@Override
	public double calculateTax() {
		// 18 %
		return this.getPrice() * 0.18;
	}
}
