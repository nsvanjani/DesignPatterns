package com.design.patterns.memento;

public class Originator {

	private String article;

	public void setArticle(String article) {
		System.out.println( "current version of the article from originator:" + article);
		this.article = article;
	}
	
	public Memento storeInMemento() {
		System.out.println("From originator saving to memento");
	 return new Memento(this.article);
	}
	
	public String restoreFromMemento(Memento memento)
	{
		this.article = memento.getArticle();
		System.out.println("originator previous article");
		return this.article;
	}
	
}
