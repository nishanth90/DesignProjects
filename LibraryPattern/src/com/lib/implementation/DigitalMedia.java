package com.lib.implementation;

import com.lib.interfaces.Media;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

public class DigitalMedia implements Media{

	
	private  final static Media media = new DigitalMedia();

	private DigitalMedia() {
	}
	
	
	
	@Override
	public ResponseWrapper searchMedia(RequestWrapper request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseWrapper rentMedia(RequestWrapper request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Media display() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public static Media getInstance()
	{
		if(media==null)
           return media;
		else {
			return null;
		}
	}

	
}
