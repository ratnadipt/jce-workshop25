package com.inventory.app;

import com.inventory.model.Product;
import com.inventory.repository.InventoryRepositoryImp;
import com.inventory.service.InventoryServiceImp;

public class InventoryApp {
	public static void main(String[] args) {
		Product p1 = new Product(101, "Laptop", 53000, "Electronics");
		
		InventoryRepositoryImp repo = new InventoryRepositoryImp();
		InventoryServiceImp service = new InventoryServiceImp(repo); // Dependency Injection
		
		service.addProduct(p1, 10);
		service.viewInventory();
		
		service.addStock(101, 15);
		service.viewInventory();
		
		service.removeStock(101, 5);
		service.viewInventory();
	}
}
