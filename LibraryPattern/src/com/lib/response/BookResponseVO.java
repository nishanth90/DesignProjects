package com.lib.response;

import java.util.ArrayList;
import java.util.List;

import com.lib.DomainObjects.Books;

public class BookResponseVO {
	
	List<Books> books = new ArrayList<Books>();
	public List<Books> getBooks() {
		return books;
	}
	public void setBooks(List<Books> books) {
		this.books = books;
	}
	

}
