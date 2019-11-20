/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.MimeTypes;

/**
 * @author Billy Bissic
 *
 */
public class MimeTypeAlreadyExistsException extends RuntimeException {
	
	public MimeTypeAlreadyExistsException(MimeTypes mimeType) {
		super("The mime type '" + mimeType.getMime_type_name() + "' already exists. Cannot continue with this procedure.");
	}

}
