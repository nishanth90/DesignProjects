package com.lib.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.lib.DomainObjects.Books;
import com.lib.DomainObjects.DomainObjects;
import com.lib.DomainObjects.VCD;
import com.lib.interfaces.Media;
import com.lib.store.LibraryStore;
import com.lib.utility.LibraryFactory;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

/**
 * 
 * 
 * 
 * @author aniket
 *
 *
 *Use the global Map and Test the code 
 */
public class ControllerClass {

	private static Map<String,? super DomainObjects> myStore = new HashMap<>();
	
	public static void main(String[] args) {

		
		LibraryStore store = LibraryStore.getStoreInstance();
		System.out.println(store);
		
	
		
		boolean value = true;
		Books book1 = new Books();
		book1.setAuthor("Bloch");
		book1.setAvailable(value);
		book1.setISBN("1234");
		book1.setNumOfCopies(1);
		book1.setName("Effective Java");
		book1.setPublisher("Pearson");
		
		
		
		Books book2 = new Books();
		book2.setAuthor("Lafore");
		book2.setAvailable(value);
		book2.setISBN("5647");
		book2.setNumOfCopies(1);
		book2.setName("Algo Java");
		book2.setPublisher("Pearson");
		
		myStore.put("Bloch$Effective Java$Pearson", book1);
		store.setLibraryMap(myStore);
		
		
		//Adding VCDs
		
		VCD vcd1 = new VCD();
		vcd1.setAlbumName("Titanic");
		vcd1.setArtist("Leone");
		vcd1.setAvailable(value);
		vcd1.setNumOfCopies(1);
		
		
		//Select Category - such as Books, Magzines,VCD etc
		
		System.out.println("Please enter the category for the search");
		
		//Take input from the user
		
		//String category = System.console().readLine();
		
		String category ="Books";
		
		Media mediaInstance = LibraryFactory.MediaFactory(category);
		
		RequestWrapper request = new RequestWrapper();
		request.setcategoryType(category);
		request.setSearchKey("Bloch");
		
		ResponseWrapper response =  mediaInstance.searchMedia(request);
		if(response!=null) {
			List<Books> books = response.getBooks();
			for(Books book:books) {
				System.out.println("The response printed is");
				System.out.println(book.toString());
			}
		}
		
		
		
	}
	
	
	
	
}
