/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.CaptionTypes;

/**
 * @author Billy Bissic
 *
 */
public class CaptionTypeAlreadyExistsException extends RuntimeException {
	
	public CaptionTypeAlreadyExistsException(CaptionTypes captionType) {
		super("Caption Type: '" + captionType.getCaptionTypeName() + "', already exists.");
	}
}
