/**
 * 
 */
package com.lib.interfaces;

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

	
	
	public ResponseWrapper searchMedia(RequestWrapper request);
	
	
	public ResponseWrapper rentMedia(RequestWrapper request);
	
	public Media display(); 
	
	
}
