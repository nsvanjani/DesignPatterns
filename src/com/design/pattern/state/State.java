package com.design.pattern.state;

public interface State {

	State nextState();
	State prevState();
	void printThisState();
}
