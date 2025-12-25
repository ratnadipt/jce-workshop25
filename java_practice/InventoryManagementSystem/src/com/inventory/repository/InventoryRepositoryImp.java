package com.inventory.repository;
import com.inventory.model.InventoryItem;
public class InventoryRepositoryImp implements InventoryRepository {
	
	// Local Storage - Variable -> Database
	private InventoryItem items[] = new InventoryItem[100];
	private int index = 0;
	
	public void save(InventoryItem item) {
		// business logic
		this.items[index++] = item;
	}
	
	public InventoryItem[] findAll(){
		return this.items;
	}
	
	public InventoryItem findByProductId(int productId){
		for(InventoryItem item : this.items) {
			// check
			if(item != null && item.getProduct().getProductId() == productId) {
				return item;
			}
			
		}
		return null;
	}
}
