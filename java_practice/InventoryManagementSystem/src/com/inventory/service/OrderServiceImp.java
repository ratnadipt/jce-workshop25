package com.inventory.service;
import com.inventory.model.InventoryItem;
import com.inventory.model.Order;
import com.inventory.model.OrderItem;
import com.inventory.model.Product;
import com.inventory.repository.InventoryRepository;

public class OrderServiceImp implements OrderService {
	private Order orders[] = new Order[10];
	private int index = 0;
	private int orderCounter = 0;
	InventoryRepository inventoryRepo;
	
	public OrderServiceImp(InventoryRepository inventoryRepo) {
		this.inventoryRepo = inventoryRepo;
	}
	
	public void placeOrder(Product product, int quantity) {
		// 1. Fetch the product detail
		InventoryItem item =  inventoryRepo.findByProductId(product.getProductId());
		
		// 2. check the stock
		if(item.getQuantity() <= quantity) {
			System.out.println("Insufficient Products");
		}
		
		// 3. Confirm Order
		Order order = new Order(orderCounter++);
		OrderItem orderItem = new OrderItem(item.getProduct(), quantity);
		System.out.println(orderItem.getProduct().getProductName());
		order.addOrderItem(orderItem);
		orders[index++] = order;
		
		// 4 reduce stock
		item.removeStock(quantity);
		
		// 5. billing
		System.out.println("Order is confirmed.");
		
	}
	
	public void viewOrders() {
		// business logic
	}
}
