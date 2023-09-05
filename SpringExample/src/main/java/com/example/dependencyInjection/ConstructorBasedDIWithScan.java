package com.example.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan({ "com.example.dependencyInjection" })
public class ConstructorBasedDIWithScan {
	@Bean
	public OrderService orderService() {
		return new OrderService();
	}

	@Component
	public static class OrderServiceClient {
		private OrderService orderService;

		@Autowired
		OrderServiceClient(OrderService orderService) {
			this.orderService = orderService;
		}

		public void showPendingOrderDetails() {
			System.out.println(orderService.getOrderDetails("540"));
		}
	}

	public static void main(String... strings) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ConstructorBasedDIWithScan.class);
		OrderServiceClient bean = context.getBean(OrderServiceClient.class);
		bean.showPendingOrderDetails();
	}
}
