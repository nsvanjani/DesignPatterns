package com.design.pattern.state;

public class OrderPlacedState implements State{

	@Override
	public State nextState() {
		return new OrderReceivedState();
		
	}

	@Override
	public State prevState() {
		return null;
		
	}

	@Override
	public void printThisState() {
		System.out.println("Order placed");
		
	}

}
