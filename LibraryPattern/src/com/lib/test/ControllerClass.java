package com.lib.test;

import java.util.List;
import java.util.Scanner;

import com.lib.DomainObjects.Books;
import com.lib.DomainObjects.VCD;
import com.lib.service.IService;
import com.lib.service.LibraryService;
import com.lib.wrappers.EnhancedResponseWrapper;
import com.lib.wrappers.RequestWrapper;

/**
 * 
 * 
 * 
 * @author Nishanth
 * 
 * 
 *         User test class
 */
public class ControllerClass {

	public static void main(String[] args) {

		EnhancedResponseWrapper response = null;
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter the category for the Library operation");
		System.out.println("1>Books");
		System.out.println("2>VCD");
		String category = scanner.nextLine();

		System.out.println("Search/Rent?");
		String method = scanner.nextLine();
		
		
		System.out.println("Please enter the keyword to search/Rent:");
		String searchKey = scanner.nextLine();
		
		scanner.close();
		
		//Load the request wrapper with the user request
		RequestWrapper request = new RequestWrapper();
		request.setcategoryType(category);
		request.setSearchKey(searchKey);
		
		
		//Get instance of the Library Service
		IService libraryService = LibraryService.getServiceInstance();
		
		//Request the service to Library
		response = libraryService.requestService(request, method);	
		
		//Iterate Response for the result
		if (response != null) {
			if (response.getBookResponseVO()!=null && response.getBookResponseVO().getBooks() != null) {
				List<Books> books = response.getBookResponseVO().getBooks();
				for (Books book : books) {
					System.out.println("The response printed is");
					System.out.println(book.toString());
				}
			}
			if (response.getVcdResponseVO()!= null && response.getVcdResponseVO().getVcds() != null) {
				List<VCD> vcds = response.getVcdResponseVO().getVcds();
				for (VCD vcd : vcds) {
					System.out.println("The response printed is");
					System.out.println(vcd.toString());
				}
			}
		}

		else {
			System.out.println("No data returned");
		}

	}

}
