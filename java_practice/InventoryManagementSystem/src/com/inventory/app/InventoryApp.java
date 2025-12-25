package com.inventory.app;

import com.inventory.model.Product;
import com.inventory.model.InventoryItem;

public class InventoryApp {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 53000, "Electronics");
		
		InventoryItem item1 = new InventoryItem(p1, 20);
		
		System.out.println("Current Stock of : " + item1.getProduct().getProductName());
		System.out.println("Quantity : " + item1.getQuantity());
		
		// add
		item1.addStock(10);
		System.out.println("Add - Quantity : " + item1.getQuantity());
		
		// remove
		item1.removeStock(5);
		System.out.println("Remove - Quantity : " + item1.getQuantity());
	}
}
