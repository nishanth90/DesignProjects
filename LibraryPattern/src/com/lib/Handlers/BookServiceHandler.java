package com.lib.Handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.lib.DomainObjects.Books;
import com.lib.DomainObjects.DomainObjects;
import com.lib.interfaces.IHandler;
import com.lib.store.LibraryStore;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

/**
 * 
 * This class will have :
 * 
 * 
 * search for books rent books add books
 * 
 * in a common data collection or DB(No Sql)
 * 
 * 
 * 
 * 
 */
public class BookServiceHandler implements IHandler {

	private Map<String, ? super DomainObjects> bookMap = null;
	private ResponseWrapper response = new ResponseWrapper();

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * public void addBooks(Books books) { if(bookSet.contains(books)){
	 * for(Books book:bookSet){ if(book.equals(books))
	 * book.setNumOfCopies(book.getNumOfCopies()+1); } } else{
	 * books.setAvailable(true); books.setNumOfCopies(1); bookSet.add(books); }
	 * 
	 * 
	 * }
	 */

	/*
	 * 
	 * 
	 */
	public ResponseWrapper rent(RequestWrapper requestBooks) {

		bookMap = LibraryStore.getStoreInstance().getLibraryMap();
		List<Books> books = new ArrayList<Books>();
		String searchkey = requestBooks.getSearchKey();
		Set<String> keys = bookMap.keySet();
		for (String key : keys) {
			System.out.println(key);
			if (key.contains(searchkey))
				;

			Books book = (Books) bookMap.get(key);
			if (book.getNumOfCopies() != 0) {
				book.setNumOfCopies(book.getNumOfCopies() - 1);
				books.add(book);
				response.setBooks(books);
				return response;
			}

		}
		return null;

	}

	/**
	 * 
	 * 
	 * 
	 */
	public ResponseWrapper search(RequestWrapper requestBooks) {

		System.out.println("Into the search method of book handler");
		bookMap = LibraryStore.getStoreInstance().getLibraryMap();

		List<Books> books = new ArrayList<Books>();
		String searchkey = requestBooks.getSearchKey();

		Set<String> keys = bookMap.keySet();
		for (String key : keys) {
			System.out.println(key);
			if (key.contains(searchkey))
				;
			{
				System.out.println("found it");

				Books book = (Books) bookMap.get(key);
				if (book.getNumOfCopies() != 0) {
					books.add(book);
					response.setBooks(books);
					return response;
				}
			}
		}

		return null;

	}

}