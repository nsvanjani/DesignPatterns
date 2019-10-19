package com.design.patterns.memento;

public class TestMemento {
public static void main(String[] args) {
	// This pattern allows us to keep versions/ store states of objects 
	// Example : roll back capability
	
	
	CareTaker careTaker  = new CareTaker();
	Originator origin = new Originator();
	origin.setArticle("Version1");
	Memento m = origin.storeInMemento();
	careTaker.addMemento(m);
	origin.setArticle("Version2");
	m = origin.storeInMemento();
	careTaker.addMemento(m);
	origin.setArticle("Version3");
	m = origin.storeInMemento();
	careTaker.addMemento(m);
	origin.setArticle("Version4");
	m = origin.storeInMemento();
	careTaker.addMemento(m);
	origin.setArticle("Version5");
	m = origin.storeInMemento();
	careTaker.addMemento(m);
	
}
}
