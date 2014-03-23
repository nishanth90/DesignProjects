package com.lib.Handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.lib.DomainObjects.Books;
import com.lib.DomainObjects.DomainObjects;
import com.lib.interfaces.IHandler;
import com.lib.response.BookResponseVO;
import com.lib.store.LibraryStore;
import com.lib.wrappers.EnhancedResponseWrapper;
import com.lib.wrappers.RequestWrapper;

/**
 * search for books rent books add books in a common data collection
 * 
 * @author Nishanth
 * 
 * 
 */
public class BookServiceHandler implements IHandler {

	private Map<String, ? super DomainObjects> bookMap = null;
	private EnhancedResponseWrapper response = new EnhancedResponseWrapper();

	/*
	 * 
	 * Rent Book method
	 */
	public EnhancedResponseWrapper rent(RequestWrapper requestBooks) {		
		BookResponseVO bookResponseVO = new BookResponseVO();
		bookMap = LibraryStore.getStoreInstance().getLibraryMap();
		EnhancedResponseWrapper response = search(requestBooks);	
		if(response != null){
			bookResponseVO = response.getBookResponseVO();
			List<Books> books = bookResponseVO.getBooks();			
			Books book = (Books) bookMap.get(requestBooks.getSearchKey());
			if (book.getNumOfCopies() != 0) {
				book.setNumOfCopies(book.getNumOfCopies() - 1);
				books.add(book);
				bookResponseVO.setBooks(books);
				response.setBookResponseVO(bookResponseVO);
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
	public EnhancedResponseWrapper search(RequestWrapper requestBooks) {
		BookResponseVO bookResponseVO = new BookResponseVO();
		System.out.println("Into the search method of book handler");
		bookMap = LibraryStore.getStoreInstance().getLibraryMap();
		List<Books> books = new ArrayList<Books>();
		String searchkey = requestBooks.getSearchKey();
		Set<String> keys = bookMap.keySet();
		for (String key : keys) {
			if (key.contains(searchkey)) {
				Books book = (Books) bookMap.get(key);
				if (book.getNumOfCopies() != 0) {
					books.add(book);
					bookResponseVO.setBooks(books);
					response.setBookResponseVO(bookResponseVO);
					return response;
				}
			}
		}

		return null;

	}

}