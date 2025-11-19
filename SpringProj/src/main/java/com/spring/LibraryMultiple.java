package com.spring;

import java.util.List;

public class LibraryMultiple {
	private List<Book> books; // books is property

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) { //setter injections
		this.books = books;
	}
	
}
