package com.inventory.service;

import com.inventory.model.Product;

public interface InventoryService {
	void addProduct(Product product, int quantity);
	void addStock(int productId, int stock);
	void removeStock(int productId, int stock);
	void viewInventory();
}
