package com.lib.Fixed;

public enum DIGITALMEDIA {
    
	VCD;

	
public static String getType(String category) {
		
		for(DIGITALMEDIA value:DIGITALMEDIA.values()) {
			
			if(value.equals(category.toUpperCase()))
				return value.toString();
		}
		
	return null;}
	}


