package com.lib.test;

import java.util.List;
import java.util.Scanner;

import com.lib.DomainObjects.Books;
import com.lib.interfaces.Media;
import com.lib.loadData.DataLoader;
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

	static{		
		 DataLoader.loadData();
	}
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the category for the search");
		System.out.println("1>Books");
		System.out.println("2>VCD");
		//Take input from the user
		
		String category = scanner.nextLine();
		
		Media mediaInstance = LibraryFactory.MediaFactory(category);
		
		RequestWrapper request = new RequestWrapper();
		
		request.setcategoryType(category);
		request.setSearchKey("Bloch");
		
		ResponseWrapper response =  mediaInstance.searchMedia(request);
		if (response != null) {
			if (response.getBooks() != null) {
				List<Books> books = response.getBooks();
				for (Books book : books) {
					System.out.println("The response printed is");
					System.out.println(book.toString());
					}
			}			
			
		}
		
		
		
	}
	
	
	
	
}
