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
public class MediaTypeNotFoundException extends RuntimeException {

	public MediaTypeNotFoundException(MediaTypes mediaType) {
		super("Media Type not found.");
	}
}
