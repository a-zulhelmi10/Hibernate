package com.spring;

public class Library {
	private Book book; //property

	//create setters and getters method
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) { //using setter injection
		this.book = book;
	}
	
}
