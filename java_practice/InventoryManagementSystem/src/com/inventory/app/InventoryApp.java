package com.inventory.app;

import com.inventory.model.ElectronicProduct;
import com.inventory.model.Product;
import com.inventory.repository.InventoryRepositoryImp;
import com.inventory.service.InventoryServiceImp;
import com.inventory.service.OrderService;
import com.inventory.service.OrderServiceImp;

public class InventoryApp {
	public static void main(String[] args) {
		Product p1 = new ElectronicProduct(101, "Laptop", 53000, "Electronics");
		
		InventoryRepositoryImp repo = new InventoryRepositoryImp();
		InventoryServiceImp service = new InventoryServiceImp(repo); // Dependency Injection
		
		service.addProduct(p1, 10);
//		service.viewInventory();
		
		service.addStock(101, 15);
//		service.viewInventory();
		
		service.removeStock(101, 5);
//		service.viewInventory();
		
		service.viewInventory();
		
		// client
		OrderService oService = new OrderServiceImp(repo);
		oService.placeOrder(p1, 50);
		
		service.viewInventory();
		
		
	}
}
