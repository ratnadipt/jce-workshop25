package com.inventory.service;
import com.inventory.model.Product;
public interface OrderService {
	void placeOrder(Product product, int quantity);
	void viewOrders();
}
