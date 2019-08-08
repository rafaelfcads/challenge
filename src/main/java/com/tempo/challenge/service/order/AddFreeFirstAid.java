package com.tempo.challenge.service.order;

import com.tempo.challenge.entity.order.Order;
import com.tempo.challenge.entity.product.Video;

public class AddFreeFirstAid extends OrderProcess {

	private boolean isVideo(Order order) {
		return order.getProduct() instanceof Video;
	}
	
	@Override
	protected boolean shouldProcess(Order order) {
		return this.isVideo(order) && ((Video) order.getProduct()).hasFirstAid();
	}

	@Override
	protected void execute(Order order) {
		System.out.println("Add Free First Aid!");
	}

//	private OrderProcess nextProcess;
//	
//	private void addFreeFirstAid() {
//		System.out.println("Add Free First Aid!");
//	}
//	
//	private boolean isVideo(Order order) {
//		return order.getProduct() instanceof Video;
//	}
//	
//	public boolean shouldProcess(Order order) {
//		return this.isVideo(order) && ((Video) order.getProduct()).hasFirstAid();
//	}
//
//	public void process(Order order) {
//		if (this.shouldProcess(order)) this.addFreeFirstAid();
//		if (this.nextProcess != null) this.nextProcess.process(order);
//	}
//
//	public void setNextProcess(OrderProcess nextProcess) {
//		this.nextProcess = nextProcess;
//	}
	
}
