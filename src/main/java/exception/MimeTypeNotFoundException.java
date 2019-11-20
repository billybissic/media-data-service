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
public class MimeTypeNotFoundException extends RuntimeException {
	public MimeTypeNotFoundException(MimeTypes mimeType) {
		super("Unable to find any mime type with the name '" + mimeType.getMime_type_name() + "'");
	}
}
