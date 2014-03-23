package com.lib.service;

import com.lib.wrappers.EnhancedResponseWrapper;
import com.lib.wrappers.RequestWrapper;

public interface IService {
	public EnhancedResponseWrapper requestService(RequestWrapper request, String operation);
}
