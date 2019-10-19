package com.design.pattern.state;

public class StateTest {
public static void main(String[] args) {
	Package p = new Package();
	p.printCurrentState();
	p.movePackageTONextState();
	p.printCurrentState();
	p.movePackageTOPreviousState();
	p.printCurrentState();
	p.movePackageTONextState();
	p.printCurrentState();
	p.movePackageTONextState();
	p.printCurrentState();
}
}
