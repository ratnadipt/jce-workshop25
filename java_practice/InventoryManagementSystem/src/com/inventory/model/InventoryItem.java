package com.inventory.model;

public class InventoryItem {
	 private Product product; // HAS-A : Composition
	 private int quantity;
	 
	 public InventoryItem(Product product, int quantity) {
		 this.product = product;
		 this.quantity = quantity;
	 }
	 
	 // other method
	 public void addStock(int quantity) {
		 this.quantity = this.quantity + quantity;
	 }
	 
	 public boolean removeStock(int quantity) {
		 // validation - negative value
		 if(this.quantity <= 0) {
			return false; 
		 }
		 else {
			 	 this.quantity = this.quantity - quantity;
			 	 return true;
		 }
	 }
	 
	 public Product getProduct() {
		 return this.product;
	 }
	 
	 public int getQuantity() {
		 return this.quantity;
	 }
}
