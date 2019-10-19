package com.design.pattern.state;

public class OrderReceivedState implements State {

	@Override
	public State nextState() {
		return new OrderReceivedState();

	}

	@Override
	public State prevState() {
		return new OrderPlacedState();

	}

	@Override
	public void printThisState() {
		System.out.println("Order received");

	}

}
