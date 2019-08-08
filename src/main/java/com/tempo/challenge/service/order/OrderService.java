package com.tempo.challenge.service.order;

import com.tempo.challenge.entity.order.Order;

public class OrderService {
	
	public void process(Order order) {
		OrderProcess orderProcess = OrderProcessBuilder
			.getInstance(new ActivateMemberShip())
			.add(new AddFreeFirstAid())
			.add(new GenerateCommissionPayment())
			.add(new PackingSlip())
			.add(new SendEmail())
			.add(new UpgradeMemberShip())
			.build();

		orderProcess.process(order);
	}
	
}
