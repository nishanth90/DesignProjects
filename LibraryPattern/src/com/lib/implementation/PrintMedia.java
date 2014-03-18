/**
 * 
 */
package com.lib.implementation;

import com.lib.interfaces.IHandler;
import com.lib.interfaces.Media;
import com.lib.utility.HandlerFactory;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

/**
 * @author aniket
 *
 */
public class PrintMedia implements Media{
	
	
	private  final static Media media = new PrintMedia();
	
	private PrintMedia() {
		
	}

	
	/*
	 * Select the appropriate for handling the search operation
	 * 
	 * Note the print media can be Books, Magzines, Comics etc
	 * 
	 * So each one will have its own Handler based on the filter criteria.
	 * 
	 * (non-Javadoc)
	 * @see com.lib.interfaces.Media#searchMedia(java.lang.String, java.lang.String)
	 */
	@Override
	public ResponseWrapper searchMedia(RequestWrapper request ) {

		IHandler handler = HandlerFactory.getHandler(request.getcategoryType());
						
		ResponseWrapper response = handler.search(request);
		return response;
	}

	@Override
	public ResponseWrapper rentMedia(RequestWrapper request) {

		IHandler handler = HandlerFactory.getHandler(request.getcategoryType());
		ResponseWrapper response = handler.search(request);
		return response;

	}

	@Override
	public Media display() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static Media getInstance()
	{
		return media;
		
	}
	
	
	/**
	 * 
	 * 
	 * 
	 */
	

}
