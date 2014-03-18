package com.lib.interfaces;

import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

public interface IHandler {
	
	
	public ResponseWrapper rent(RequestWrapper request);


	public ResponseWrapper search(RequestWrapper request);


}
