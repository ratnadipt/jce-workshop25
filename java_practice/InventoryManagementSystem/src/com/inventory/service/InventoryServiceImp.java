package com.inventory.service;

import com.inventory.model.InventoryItem;
import com.inventory.model.Product;
import com.inventory.repository.InventoryRepositoryImp;

public class InventoryServiceImp implements InventoryService {
	
	// dependency -> Repository
	private InventoryRepositoryImp inventoryRepo;
	
	// inject -> Constructor
	public InventoryServiceImp(InventoryRepositoryImp repo) {
		this.inventoryRepo = repo;
	}
	
	public void addProduct(Product product, int quantity) {
		InventoryItem item = new InventoryItem(product, quantity);
		inventoryRepo.save(item);
	}
	
	public void addStock(int productId, int stock) {
		InventoryItem item = inventoryRepo.findByProductId(productId);
		item.addStock(stock);
		
	}
	
	public void removeStock(int productId, int stock) {
		InventoryItem item = inventoryRepo.findByProductId(productId);
		item.removeStock(stock);
	}
	
	public void viewInventory() {
		InventoryItem items[] = inventoryRepo.findAll();
		System.out.println("Product Details : ");
		System.out.println("| NAME |\t\t | PRICE | \t\t | QUANTITY |");
		for(InventoryItem item : items) {
			if(item != null) {
			System.out.print(" | " + item.getProduct().getProductName());
			System.out.print(" | " + item.getProduct().getPrice());
			System.out.println(" | " + item.getQuantity());
			System.out.println("------------------------------------------");
			}
		}
	}
	
}
