package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryMultiTest {
	public static void main(String[] args) {
		//load spring bean xml conf file
		ApplicationContext context = new ClassPathXmlApplicationContext("library.xml"); //ApplicationContext is an Interface whereas ClassPathXmlApplicationContext is class that implements that interface
		//get the bean
		LibraryMultiple  lm = (LibraryMultiple) context.getBean("libMulti");
		List<Book> books = lm.getBooks();
		for (Book b : books)
			System.out.println(b);
		
		System.out.println("**********Using for each**************");
		books.forEach(System.out::println);
		
		System.out.println("**********Library***************");
		Library lib = (Library) context.getBean("lib");
		Book book = lib.getBook();
		System.out.println(book);
	
	}
}
