package com.tempo.challenge.service.order;

import com.tempo.challenge.entity.order.Order;
import com.tempo.challenge.entity.product.Book;

public class GenerateCommissionPayment extends OrderProcess {

	private boolean isBook(Order order) {
		return order.getProduct() instanceof Book;
	}
	
	@Override
	protected boolean shouldProcess(Order order) {
		return order.getProduct().isPhisical() || this.isBook(order);
	}

	@Override
	protected void execute(Order order) {
		System.out.println("Generate a commission payment to the agent.!");
	}
	
}
