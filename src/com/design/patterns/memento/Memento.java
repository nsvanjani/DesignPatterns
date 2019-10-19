package com.design.patterns.memento;

public class Memento {
private String article;

public String getArticle() {
	return article;
}

public Memento(String article) {
	super();
	this.article = article;
}

public void setArticle(String article) {
	this.article = article;
}

}
