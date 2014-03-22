/**
 * 
 */
package com.lib.interfaces;

import com.lib.wrappers.EnhancedResponseWrapper;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

/**
 * @author aniket
 *
 *
 *This will have the
 *
 *searchMedia()
 *rentMedia()
 *SubscribeMedia();
 *
 */
public interface Media {

	
	
	public EnhancedResponseWrapper searchMedia(RequestWrapper request);
	
	
	public EnhancedResponseWrapper rentMedia(RequestWrapper request);
	
	public Media display(); 
	
	
}
