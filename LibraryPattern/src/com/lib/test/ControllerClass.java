package com.lib.test;

import java.util.List;
import java.util.Scanner;

import com.lib.DomainObjects.Books;
import com.lib.DomainObjects.Magzines;
import com.lib.DomainObjects.VCD;
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
 *         Use the global Map and Test the code
 */
public class ControllerClass {

	static {
		DataLoader.loadData();
	}

	public static void main(String[] args) {

		ResponseWrapper response = null;
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

		Media mediaInstance = LibraryFactory.MediaFactory(category);

		RequestWrapper request = new RequestWrapper();

		request.setcategoryType(category);
		request.setSearchKey(searchKey);

		if (method.equalsIgnoreCase("search")) {
			response = mediaInstance.searchMedia(request);
		} else if (method.equalsIgnoreCase("rent")) {
			response = mediaInstance.rentMedia(request);
		}

		if (response != null) {
			if (response.getBooks() != null) {
				List<Books> books = response.getBooks();
				for (Books book : books) {
					System.out.println("The response printed is");
					System.out.println(book.toString());
				}
			}
			if (response.getVcds() != null) {
				List<VCD> vcds = response.getVcds();
				for (VCD vcd : vcds) {
					System.out.println("The response printed is");
					System.out.println(vcd.toString());
				}
			}
			if (response.getMagzines() != null) {
				List<Magzines> magzns = response.getMagzines();
				for (Magzines magz : magzns) {
					System.out.println("The response printed is");
					System.out.println(magz.toString());
				}
			}

		}

		else {
			System.out.println("No data returned");
		}

	}

}
