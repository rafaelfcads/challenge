package com.tempo.challenge.service.order;

import com.tempo.challenge.entity.order.Order;
import com.tempo.challenge.entity.product.MemberShip;
import com.tempo.challenge.entity.user.Level;

public class UpgradeMemberShip extends OrderProcess {
	
	private boolean isMemberShip(Order order) {
		return order.getProduct() instanceof MemberShip;
	}

	@Override
	protected boolean shouldProcess(Order order) {
		return this.isMemberShip(order) 
				&& ((MemberShip) order.getProduct()).isUpgrade();
	}

	@Override
	protected void execute(Order order) {
		order.getUser().setMemberShipLevel(Level.FULL);
	}

}
