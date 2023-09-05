package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FieldBasedDI {
	@Bean
	public OrderService orderService() {
		return new OrderService();
	}

	@Bean
	public OrderServiceClient orderServiceClient() {
		return new OrderServiceClient();
	}

	public static void main(String... strings) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(FieldBasedDI.class);
		OrderServiceClient bean = context.getBean(OrderServiceClient.class);
		bean.showPendingOrderDetails();
	}

	private static class OrderServiceClient {
		@Autowired
		private OrderService orderService;

		public void showPendingOrderDetails() {
			System.out.println(orderService.getOrderDetails("300"));
		}
	}
}
