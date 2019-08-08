package com.tempo.challenge.service.order;

import com.tempo.challenge.entity.order.Order;
import com.tempo.challenge.entity.product.MemberShip;
import com.tempo.challenge.entity.user.Status;


public class ActivateMemberShip extends OrderProcess {
		
	private boolean isMemberShip(Order order) {
		return order.getProduct() instanceof MemberShip;
	}
	
	@Override
	protected boolean shouldProcess(Order order) {
		return this.isMemberShip(order) 
				&& ((MemberShip) order.getProduct()).isActivate();
	}

	@Override
	protected void execute(Order order) {
		order.getUser().setMemberShipStatus(Status.ACTIVATED);
	}
	
}
