package com.lib.store;

import java.util.Map;

import com.lib.DomainObjects.DomainObjects;

/**
 * 
 * 
 * 
 * @author aniket
 *
 *This class will have a common collection for storing the library objects.
 *
 *This is a singleton, and denotes one common data store for all the parts of library
 *
 *
 */
public class LibraryStore {

	private final static LibraryStore libraryInstance = new LibraryStore(); 
	
	
	private LibraryStore() {
		
	}
	
	Map<String,? super DomainObjects> libraryMap;

	public Map<String, ? super DomainObjects> getLibraryMap() {
		return libraryMap;
	}

	public void setLibraryMap(Map<String, ? super DomainObjects> libraryMap) {
		this.libraryMap = libraryMap;
	}
	
	
	
	public static LibraryStore getStoreInstance() {
		
		return libraryInstance;
	}
	
}
