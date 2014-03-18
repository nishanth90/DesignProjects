/**
 * 
 */
package com.lib.utility;

import com.lib.Fixed.PRINTMEDIA;
import com.lib.Handlers.BookServiceHandler;
import com.lib.Handlers.VCDServiceHandler;
import com.lib.interfaces.IHandler;

/**
 * @author aniket
 * 
 */
public class HandlerFactory {

	public static IHandler getHandler(String category) {

		if (category.equalsIgnoreCase("Books")) {

			return new BookServiceHandler();
		} else if (category.equalsIgnoreCase("VCD")) {
			return new VCDServiceHandler();
		} else if (PRINTMEDIA.getType(category).equalsIgnoreCase(category)) {

			return null;

		} else
			return null;

	}

}
