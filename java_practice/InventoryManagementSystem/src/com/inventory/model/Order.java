package com.inventory.model;

public class Order {
	private int orderId;
	private OrderItem orderItems[] = new OrderItem[50];
	private int index = 0;
	
	public Order(int orderId) {
		this.orderId = orderId;
	}
	
	public void addOrderItem(OrderItem item) {
		orderItems[index++] = item;
	}
	
	//billing
	public double calculateTotal() {
		double total = 0;
		
		for(OrderItem item : orderItems) {
			if(item != null) {
				total += item.getTotalAmount();
			}
		}
		
		return total;
	}
		
}
