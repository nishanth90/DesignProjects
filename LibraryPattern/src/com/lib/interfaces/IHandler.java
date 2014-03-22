package com.lib.interfaces;

import com.lib.wrappers.EnhancedResponseWrapper;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

public interface IHandler {
	
	
	public EnhancedResponseWrapper rent(RequestWrapper request);


	public EnhancedResponseWrapper search(RequestWrapper request);


}
