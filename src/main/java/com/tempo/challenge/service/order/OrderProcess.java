package com.tempo.challenge.service.order;

import com.tempo.challenge.entity.order.Order;

public abstract class OrderProcess {
	
	protected OrderProcess nextProcess;
	
	public void process(Order order) {
		if (this.shouldProcess(order)) this.execute(order);
		if (this.nextProcess != null) this.nextProcess.process(order);
	}
	
	public void setNextProcess(OrderProcess nextProcess) {
		this.nextProcess = nextProcess;
	}
	
	protected abstract boolean shouldProcess(Order order);
	
	protected abstract void execute(Order order);

}
