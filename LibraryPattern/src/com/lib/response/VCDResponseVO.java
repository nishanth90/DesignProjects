package com.lib.response;

import java.util.List;

import com.lib.DomainObjects.VCD;

public class VCDResponseVO {
	
	List<VCD> vcds;
	public List<VCD> getVcds() {
		return vcds;
	}
	public void setVcds(List<VCD> vcds) {
		this.vcds = vcds;
	}
}
