package com.lib.Fixed;

public enum DIGITALMEDIA {
    
	VCD;

	
public static String getType(String category) {
		
		for(PRINTMEDIA value:PRINTMEDIA.values()) {
			
			if(value.equals(category.toUpperCase()))
				return value.toString();
		}
		
	return null;}
	}


