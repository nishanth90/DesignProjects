package com.lib.service;

import com.lib.interfaces.Media;
import com.lib.loadData.DataLoader;
import com.lib.utility.LibraryFactory;
import com.lib.wrappers.EnhancedResponseWrapper;
import com.lib.wrappers.RequestWrapper;

/**
 * 
 * 
 * Service Class to request service to the Library
 * 
 * Singleton class
 * 
 * @author Nishanth
 * 
 * 
 * **/

public class LibraryService implements IService {

	private static final LibraryService libraryService = new LibraryService();

	private LibraryService() {
	}

	public static LibraryService getServiceInstance() {
		return libraryService;
	}

	static {
		DataLoader.loadData();
	}

	public EnhancedResponseWrapper requestService(RequestWrapper request,
			String operation) {
		EnhancedResponseWrapper response = null;
		Media mediaInstance = LibraryFactory.MediaFactory(request
				.getcategoryType());
		if (operation.equalsIgnoreCase("search")) {
			response = mediaInstance.searchMedia(request);
		} else if (operation.equalsIgnoreCase("rent")) {
			response = mediaInstance.rentMedia(request);
		}
		return response;

	}

}
