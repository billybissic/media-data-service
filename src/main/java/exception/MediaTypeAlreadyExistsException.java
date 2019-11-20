/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.MediaTypes;

/**
 * @author Billy Bissic
 *
 */
public class MediaTypeAlreadyExistsException extends RuntimeException {

	public MediaTypeAlreadyExistsException(MediaTypes mediaType) {
		super("Media Type already exists for Media Type: '" + mediaType.getMedia_type_abbreviation() + "'");
	}
}
