package com.design.pattern.state;

public class Package {
 private State state = new OrderPlacedState();
 

public void movePackageTONextState()
 {
	 state = state.nextState();
 }
 
 public void movePackageTOPreviousState()
 {
	 state=state.prevState();
 }
 
 public void printCurrentState() {
	 state.printThisState();
 }
 
}
