package com.lib.wrappers;

import com.lib.response.BookResponseVO;
import com.lib.response.VCDResponseVO;

public class EnhancedResponseWrapper {
	BookResponseVO bookResponseVO;
	VCDResponseVO vcdResponseVO;

	public VCDResponseVO getVcdResponseVO() {
		return vcdResponseVO;
	}

	public void setVcdResponseVO(VCDResponseVO vcdResponseVO) {
		this.vcdResponseVO = vcdResponseVO;
	}

	public BookResponseVO getBookResponseVO() {
		return bookResponseVO;
	}

	public void setBookResponseVO(BookResponseVO bookResponseVO) {
		this.bookResponseVO = bookResponseVO;
	}

}
