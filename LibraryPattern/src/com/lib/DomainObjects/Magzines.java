/**
 * 
 */
package com.lib.DomainObjects;

/**
 * @author aniket
 *
 */
public class Magzines extends DomainObjects{

	
	private String name;
	
	private String issueDate;
	
	
    public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
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

	private boolean isAvailable;
	
	private int numOfCopies;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return " BookName: "+name+" IssueDate: "+issueDate+" Num of Copies: "+numOfCopies;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
	      if(obj instanceof Magzines) {
	    	 Magzines object = (Magzines)obj;
	    	
	    	 return (this.getIssueDate().equals(object.getIssueDate()));

	      
	      }
	      else
	  	  return false;
	 	    	
	}

	
}
