/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import exception.CaptionNotFoundException;
import exception.CaptionTypeAlreadyExistsException;
import exception.CaptionTypeNotFoundException;
import exception.MediaTypeAlreadyExistsException;
import exception.MediaTypeNotFoundException;
import exception.MimeTypeAlreadyExistsException;
import exception.MimeTypeGroupAlreadyExistsException;
import exception.MimeTypeGroupNotFoundException;
import exception.MimeTypeNotFoundException;
import exception.NoDataAvailableException;

import org.springframework.hateoas.VndErrors;

/**
 * @author Billy Bissic
 *
 */
@ControllerAdvice
@RequestMapping(produces = "application/vnd.error")
public class MediaDataControllerAdvice {
	
	@ResponseBody
	@ExceptionHandler(CaptionTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors captionTypeAlreadyExistsException(CaptionTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(MediaTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors mediaTypeAlreadyExistsException(MediaTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(MimeTypeAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors mimeTypeAlreadyExistsException(MimeTypeAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(MimeTypeGroupAlreadyExistsException.class)
	@ResponseStatus(HttpStatus.CONFLICT)
	VndErrors mimeTypeGroupAlreadyExistsException(MimeTypeGroupAlreadyExistsException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(CaptionNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors captionNotFoundException(CaptionNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(CaptionTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors captionTypeNotFoundException(CaptionTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(MediaTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors mediaTypeNotFoundException(MediaTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(MimeTypeGroupNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors mimeTypeGroupNotFoundException(MimeTypeGroupNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(MimeTypeNotFoundException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors mimeTypeNotFoundException(MimeTypeNotFoundException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	
	@ResponseBody
	@ExceptionHandler(NoDataAvailableException.class)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	VndErrors noDataAvailableException(NoDataAvailableException ex) {
		return new VndErrors("error", ex.getMessage());
	}
	

}
