package com.inventory.model;

public class OrderItem {
	private Product product;  //  composition
	private int quantity;
	
	public OrderItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}

	public Product getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getTotalAmount() {
		return (this.product.getPrice() + this.product.calculateTax()) * this.quantity;
	}
}
