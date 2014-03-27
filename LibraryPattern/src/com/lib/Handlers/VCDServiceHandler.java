package com.lib.Handlers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.lib.DomainObjects.DomainObjects;
import com.lib.DomainObjects.VCD;
import com.lib.interfaces.IHandler;
import com.lib.response.VCDResponseVO;
import com.lib.store.LibraryStore;
import com.lib.wrappers.EnhancedResponseWrapper;
import com.lib.wrappers.RequestWrapper;
import com.lib.wrappers.ResponseWrapper;

/**
 * 
 * 
 * 
 * 
 * @author nishanth
 *
 *
 *This will have methods like rent and search
 *
 *
 *
 */
public class VCDServiceHandler implements IHandler{
	
	private Map<String,? super DomainObjects> VCDMap = null;
	private EnhancedResponseWrapper response = new EnhancedResponseWrapper();
	

	@Override
	public EnhancedResponseWrapper rent(RequestWrapper request) {
		VCDResponseVO vcdResponseVO = null;
		VCDMap = LibraryStore.getStoreInstance().getLibraryMap();
		EnhancedResponseWrapper response = search(request);
		if (response != null) {
			vcdResponseVO = response.getVcdResponseVO();
			List<VCD> vcds = vcdResponseVO.getVcds();
			VCD vcd = (VCD) VCDMap.get(request.getSearchKey());
			if (vcd.getNumOfCopies() != 0) {
				vcd.setNumOfCopies(vcd.getNumOfCopies() - 1);
				vcds.add(vcd);
				vcdResponseVO.setVcds(vcds);
				response.setVcdResponseVO(vcdResponseVO);
				return response;
			}
		}
		return null;
	}

	
	/**
	 * 
	 * 
	 * 
	 * 
	 */
	@Override
	public EnhancedResponseWrapper search(RequestWrapper request) {
		VCDResponseVO vcdResponseVO = new VCDResponseVO();
		VCDMap = LibraryStore.getStoreInstance().getLibraryMap();
		List<VCD> vcds = new ArrayList<VCD>();
		String key = request.getSearchKey();
		if (VCDMap.containsKey(key)) {
			VCD vcd = (VCD) VCDMap.get(key);
			if (vcd.getNumOfCopies() != 0) {
				vcd.setNumOfCopies(vcd.getNumOfCopies() - 1);
				vcds.add(vcd);
				vcdResponseVO.setVcds(vcds);
				response.setVcdResponseVO(vcdResponseVO);
				return response;
			}
		}
		return null;

	}

}
