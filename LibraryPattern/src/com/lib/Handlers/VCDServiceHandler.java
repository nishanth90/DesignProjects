package com.lib.Handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lib.DomainObjects.DomainObjects;
import com.lib.DomainObjects.VCD;
import com.lib.interfaces.IHandler;
import com.lib.store.LibraryStore;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

/**
 * 
 * 
 * 
 * 
 * @author aniket
 *
 *
 *This will have methods like rent and search
 *
 *
 *
 */
public class VCDServiceHandler implements IHandler{
	
	private Map<String,? super DomainObjects> VCDMap = null;
	private ResponseWrapper response = new ResponseWrapper();
	

	@Override
	public ResponseWrapper rent(RequestWrapper request) {

		VCDMap = LibraryStore.getStoreInstance().getLibraryMap();

		List<VCD> vcds = new ArrayList<>();
		String key = request.getSearchKey();
		if(VCDMap.containsKey(key)){
				VCD vcd = (VCD)VCDMap.get(key);
			        if(vcd.getNumOfCopies() != 0){
					vcd.setNumOfCopies(vcd.getNumOfCopies()-1);
					vcds.add(vcd);
					response.setVcds(vcds);
					return response;
					}
									
			
	}return null;
	
	}

	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public ResponseWrapper search(RequestWrapper request) {
		
		
		VCDMap = LibraryStore.getStoreInstance().getLibraryMap();
		List<VCD> vcds = new ArrayList<>();
		String key = request.getSearchKey();
		if(VCDMap.containsKey(key)){
				VCD vcd = (VCD)VCDMap.get(key);
			        if(vcd.getNumOfCopies() != 0){
					vcd.setNumOfCopies(vcd.getNumOfCopies()-1);
					vcds.add(vcd);
					response.setVcds(vcds);
					return response;
					}
									
			
	}return null;
	
	
	}

}
