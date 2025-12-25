package com.inventory.repository;
import com.inventory.model.InventoryItem;

public interface InventoryRepository {
	void save(InventoryItem item);
	InventoryItem[] findAll();
	InventoryItem findByProductId(int productId);
}
