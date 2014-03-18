package com.lib.utility;

import com.lib.Fixed.PRINTMEDIA;
import com.lib.implementation.DigitalMedia;
import com.lib.implementation.PrintMedia;
import com.lib.interfaces.Media;


public class LibraryFactory {

	
	public static Media MediaFactory(String category) {
		
		System.out.println("The category is"+category);
		if(PRINTMEDIA.getType(category).equalsIgnoreCase(category)) {
			return  PrintMedia.getInstance();
		} 
		else if(PRINTMEDIA.getType(category).equalsIgnoreCase(category)) {
			
			return DigitalMedia.getInstance();

		}
		else
			return null;
		
	}
	

}
