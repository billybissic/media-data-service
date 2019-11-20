/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package exception;

import domain.MimeTypeGroups;

/**
 * @author Billy Bissic
 *
 */
public class MimeTypeGroupAlreadyExistsException extends RuntimeException {
	
	public MimeTypeGroupAlreadyExistsException(MimeTypeGroups mimeTypeGroup) {
		super("'" + mimeTypeGroup.getMime_type_group_name() + "' : Group already exists for this Mime Type.");
	}
}
