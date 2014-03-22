package com.lib.DomainObjects;

public abstract class DomainObjects {

	protected String key;
	
	protected abstract void generateKey();

	public String getKey() {
		if(key == null) {
			generateKey();
		}
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
