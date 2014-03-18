/**
 * 
 */
package com.lib.DomainObjects;


/**
 * @author aniket
 *
 */
public class Books extends DomainObjects{

	
	
	private String author;
	
	private String publisher;
	
	private String name;
	
	private String ISBN;
	
	private boolean isAvailable;
	
	private int numOfCopies;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getNumOfCopies() {
		return numOfCopies;
	}

	public void setNumOfCopies(int numOfCopies) {
		this.numOfCopies = numOfCopies;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " BookName: "+name+" ISBN: "+ISBN+" Num of Copies: "+numOfCopies;
		
		
		
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
	      if(obj instanceof Books) {
	    	 Books object = (Books)obj;
	    	
	    	 return (this.getISBN().equals(object.getISBN()));

	      
	      }
	      else
	  	  return false;
	 	    	
	}
	
}
