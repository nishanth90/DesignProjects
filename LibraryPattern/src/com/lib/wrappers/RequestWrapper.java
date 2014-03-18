package com.lib.wrappers;

/*
 * Request Object containing the searchKey and the type of library object to be requested for
 * 
 */

public class RequestWrapper {

	private String searchKey;
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	public String getcategoryType() {
		return categoryType;
	}
	public void setcategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	private String categoryType;
	
	
}

  
