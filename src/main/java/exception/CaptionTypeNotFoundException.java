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
public class CaptionTypeNotFoundException extends RuntimeException {

	public CaptionTypeNotFoundException(String captionName) {
		super("Caption Type: '" + captionName + "' not found");
	}
}
