package com.lib.Fixed;

public enum PRINTMEDIA {

	BOOKS,
	MAGAZINES;
	
	
	public static String getType(String category) {
		
		for(PRINTMEDIA value:PRINTMEDIA.values()) {

			System.out.println(value.toString());
			
			if(value.toString().equalsIgnoreCase(category)) {
						System.out.println("true");
		
				return value.toString();
		}
		}
	return null;}
	}
	

