package com.tempo.challenge.service.order;

public class OrderProcessBuilder {

	private OrderProcess orderProcess;
	
	private OrderProcess nextProcess;
	
	private OrderProcessBuilder(OrderProcess orderProcess) {
		this.orderProcess = orderProcess;
	}
	
	public OrderProcessBuilder add(OrderProcess nextProcess) {
		if (this.nextProcess == null) {
			this.orderProcess.setNextProcess(nextProcess);
		} else {
			this.nextProcess.setNextProcess(nextProcess);
		}

		this.nextProcess = nextProcess;
		return this;
	}
	
	public OrderProcess build() {
		return this.orderProcess;
	}
	
	public static OrderProcessBuilder getInstance(OrderProcess orderProcess) {
		return new OrderProcessBuilder(orderProcess);
	}

}
