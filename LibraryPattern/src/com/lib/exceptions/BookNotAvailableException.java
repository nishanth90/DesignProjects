package com.lib.exceptions;

public class BookNotAvailableException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7694802856629336818L;

	public BookNotAvailableException() {
		super("Book is currently unavailable");
	}

}
