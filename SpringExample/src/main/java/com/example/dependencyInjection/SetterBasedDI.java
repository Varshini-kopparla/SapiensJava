package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SetterBasedDI {
	@Bean
	public OrderService orderService() {
		return new OrderService();
	}

	@Bean
	public OrderServiceClient orderServiceClient() {
		return new OrderServiceClient();
	}

	private static class OrderServiceClient {
		private OrderService orderService;

		@Autowired
		public void setOrderService(OrderService orderService) {
			this.orderService = orderService;
		}

		public void showPendingOrderDetails() {
			System.out.println(orderService.getOrderDetails("200"));
		}
	}

	public static void main(String... strings) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SetterBasedDI.class);
		OrderServiceClient bean = context.getBean(OrderServiceClient.class);
		bean.showPendingOrderDetails();
	}
}