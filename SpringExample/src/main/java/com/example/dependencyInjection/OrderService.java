package com.example.dependencyInjection;

public class OrderService {
	public String getOrderDetails(String orderId) {
		return "Order details for order id=" + orderId;
	}
}