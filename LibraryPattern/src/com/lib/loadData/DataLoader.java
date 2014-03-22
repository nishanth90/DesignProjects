package com.lib.loadData;

import java.util.HashMap;
import java.util.Map;
import com.lib.DomainObjects.Books;
import com.lib.DomainObjects.DomainObjects;
import com.lib.DomainObjects.VCD;
import com.lib.store.LibraryStore;

/**
 * 
 * 
 * Loads the data for the Data Store
 * 
 * @author Nishanth
 *
 * 
 * */
public class DataLoader {
	
	private static final DataLoader dataLoader = new DataLoader();
	private static Map<String,? super DomainObjects> myStore = new HashMap<>();
	private static LibraryStore store = LibraryStore.getStoreInstance();
	
	private DataLoader(){}
	
	public static DataLoader getInstance(){
		
		return dataLoader;
	}
	
	
	/**
	 * 
	 * Loads the data in the repository
	 * 
	 * @author Nishanth
	 * 
	 * @param No param
	 * 
	 **/
	
	public static void loadData(){
		
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
		
		
		VCD vcd1 = new VCD();
		vcd1.setAlbumName("Titanic");
		vcd1.setArtist("Leone");
		vcd1.setAvailable(value);
		vcd1.setNumOfCopies(1);
		
		myStore.put(book1.getKey(), book1);
		myStore.put(book2.getKey(), book2);	
		myStore.put(vcd1.getKey(), vcd1);
		
		store.setLibraryMap(myStore);
		
	}
	
}
