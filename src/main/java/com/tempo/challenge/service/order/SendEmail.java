package com.tempo.challenge.service.order;

import com.tempo.challenge.entity.order.Order;
import com.tempo.challenge.entity.product.MemberShip;

public class SendEmail extends OrderProcess {

	private boolean isMemberShip(Order order) {
		return order.getProduct() instanceof MemberShip;
	}
	
	@Override
	protected boolean shouldProcess(Order order) {
		return this.isMemberShip(order);
	}

	@Override
	protected void execute(Order order) {
		System.out.println("Send informative e-mail about activation/upgrade!");
	}

}
