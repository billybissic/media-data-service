/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import domain.CaptionTypes;
import domain.Captions;
import domain.MediaTypes;
import domain.MimeTypeGroups;
import domain.MimeTypeObjects;
import domain.MimeTypes;
import exception.CaptionTypeAlreadyExistsException;
import exception.CaptionTypeNotFoundException;
import exception.MediaTypeAlreadyExistsException;
import exception.MediaTypeNotFoundException;
import exception.MimeTypeAlreadyExistsException;
import exception.MimeTypeGroupAlreadyExistsException;
import exception.MimeTypeGroupNotFoundException;
import exception.MimeTypeNotFoundException;
import exception.NoDataAvailableException;
import repository.CaptionTypesRepository;
import repository.CaptionsRepository;
import repository.MediaTypesRepository;
import repository.MimeTypeGroupsRepository;
import repository.MimeTypesRepository;

/**
 * @author Billy Bissic
 *
 */
@Controller
@RequestMapping(path="/api/MediadataServices")
public class MediaDataController {

	@Autowired
	private CaptionsRepository captionsRepository;
	@Autowired
	private CaptionTypesRepository captionTypesRepository;
	@Autowired
	private MediaTypesRepository mediaTypesRepository;
	@Autowired
	private MimeTypesRepository mimeTypesRepository;
	@Autowired
	private MimeTypeGroupsRepository mimeTypeGroupsRepository;

	/* Must revisit the caption implementation. Not able to determine what each caption belongs to at this time
	 * @RequestMapping(path="/addNewCaption", method = RequestMethod.POST)
	 *
	public @ResponseBody ResponseEntity<?> addNewCaption(@RequestBody Captions newCaption) {
		try
		{
			captionsRepository.save(newCaption);
			return new ResponseEntity<Object>(newCaption, HttpStatus.CREATED);
		}
		catch (DataAccessException ex)
		{
			// All other errors send generic message to browser 
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			// TODO: log the exception 
		}
	}
	
	@RequestMapping(path="/getAllCaptions", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllCaptions() {
		try
		{
			
		}
		catch (DataAccessException ex)
		{
			// All other errors send generic message to browser 
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			// TODO: log the exception 
		}
		return captionsRepository.findAll();
	}
	
	@RequestMapping(path="/deleteCaption", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteCaption(@RequestBody Captions caption) {
		try
		{
			
		}
		catch (DataAccessException ex)
		{
			// All other errors send generic message to browser 
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			// TODO: log the exception 
		}
		Captions caption = new Captions();
		caption.setCaption_id(id);
		captionsRepository.delete(caption);
		return "Delete";
	}*/
	
	@RequestMapping(path="/addCaptionType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewCaptionType(@RequestBody CaptionTypes captionType) {
		try
		{
			if(captionTypesRepository.findByCaptionTypeName(captionType.getCaptionTypeName()).isPresent()) {
				throw new CaptionTypeAlreadyExistsException(captionType);
			}
			else
			{
				captionTypesRepository.save(captionType);
				return new ResponseEntity<Object>(HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getCaptionTypeByName", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getCaptionTypeByName(@RequestParam String caption_type_name) {
		try
		{
			Iterable<CaptionTypes> captionType;
			if(captionTypesRepository.findByCaptionTypeName(caption_type_name).isPresent()) {
				captionType = captionTypesRepository.getByCaptionTypeName(caption_type_name);
				return new ResponseEntity<Object>(captionType, HttpStatus.OK);
			}
			else
			{
				throw new CaptionTypeNotFoundException(caption_type_name);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getCaptionTypeById/{id}", method = RequestMethod.POST)
	public ResponseEntity<?> getCaptionTypeById(@PathVariable Integer id)
	{
		CaptionTypes captionType = captionTypesRepository.findById(id);
		
		return new ResponseEntity<Object>(captionType, HttpStatus.OK);
	}
		
	@RequestMapping(path="/getAllCaptionTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllCaptionTypes() {
		try
		{
			Long captionTypeCount = captionTypesRepository.count();
			Iterable<CaptionTypes> captionTypes;
			
			if(captionTypeCount == 0) {
				throw new NoDataAvailableException();
			}
			else
			{
				captionTypes = captionTypesRepository.findAll();
				return new ResponseEntity<Object>(captionTypes, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteCaptionType", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteCaptionType(@RequestBody CaptionTypes captionType) {
		try
		{
			if(captionTypesRepository.findByCaptionTypeName(captionType.getCaptionTypeName()).isPresent()) {
				captionTypesRepository.delete(captionType);
				return new ResponseEntity<Object>(captionType, HttpStatus.OK);
			}
			else
			{
				captionTypesRepository.save(captionType);
				return new ResponseEntity<Object>(HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addMediaType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewMediaType(@RequestBody MediaTypes newMediaType) {
		try
		{
			if(mediaTypesRepository.findByMediaTypeName(newMediaType.getMedia_type_name()).isPresent()) {
				throw new MediaTypeAlreadyExistsException(newMediaType);
			}
			else
			{
				mediaTypesRepository.save(newMediaType);
				return new ResponseEntity<Object>(newMediaType, HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllMediaTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllMediaTypes() {
		try
		{
			Long mediaTypesCount = mediaTypesRepository.count();
			Iterable<MediaTypes> mediaTypes;
			
			if(mediaTypesCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				mediaTypes = mediaTypesRepository.findAll();
				return new ResponseEntity<Object>(mediaTypes, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteMediaType", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteMediaTypes(@RequestBody MediaTypes mediaType) {
		try
		{
			if(mediaTypesRepository.findByMediaTypeName(mediaType.getMedia_type_name()).isPresent()) {
				mediaTypesRepository.delete(mediaType);
				return new ResponseEntity<Object>(mediaType, HttpStatus.OK);
			}
			else
			{
				throw new MediaTypeNotFoundException(mediaType);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addMimeTypeGroup", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addNewMimeTypeCategory(@RequestBody MimeTypeGroups mimeTypeGroup) {
		try
		{
			if(mimeTypeGroupsRepository.findByGroupName(mimeTypeGroup.getMime_type_group_name()).isPresent()) {
				throw new MimeTypeGroupAlreadyExistsException(mimeTypeGroup);
			}
			else
			{
				mimeTypeGroupsRepository.save(mimeTypeGroup);
				return new ResponseEntity<Object>(mimeTypeGroup, HttpStatus.CREATED);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllMimeTypeGroups", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllMimeTypeCategories() {
		try
		{
			Long mimeTypeGroupsCount = mimeTypeGroupsRepository.count();
			Iterable<MimeTypeGroups> mimeTypeGroups;
			if(mimeTypeGroupsCount == 0)
			{
				throw new NoDataAvailableException();
			}
			else
			{
				mimeTypeGroups = mimeTypeGroupsRepository.findAll();
				return new ResponseEntity<Object>(mimeTypeGroups, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteMimeTypeGroup", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteMimeTypeGroup(@RequestBody MimeTypeGroups mimeTypeGroup ) {
		try
		{
			if(mimeTypeGroupsRepository.findByGroupName(mimeTypeGroup.getMime_type_group_name()).isPresent()) {
				mimeTypeGroupsRepository.delete(mimeTypeGroup);
				return new ResponseEntity<Object>(mimeTypeGroup, HttpStatus.OK);
			}
			else
			{
				throw new MimeTypeGroupNotFoundException(mimeTypeGroup);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/addMimeType", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addMimeType(@RequestBody MimeTypes mimeType) {
		try
		{
			if(mimeTypesRepository.findByMimeType(mimeType.getMime_type_name()).isPresent()) {
				throw new MimeTypeAlreadyExistsException(mimeType);
			}
			else
			{
				mimeTypesRepository.save(mimeType);
				return new ResponseEntity<Object>(mimeType, HttpStatus.CREATED);
			}
			
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getMimeTypeByGroup", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getMimeTypeByGroup(@RequestParam Integer mimeTypeGroupId) {
		try
		{
			Iterable<Object> mimeTypes;
			if(mimeTypesRepository.findByMimeGroup(mimeTypeGroupId).isPresent()) {
				mimeTypes = mimeTypesRepository.findAllMimesForGroup(mimeTypeGroupId);
				return new ResponseEntity<Object>(mimeTypes, HttpStatus.OK);
			}
			else
			{
				throw new NoDataAvailableException();
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/getAllMimeTypes", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> getAllMimeTypes() {
		try
		{
			Long mimeTypesCount = mimeTypesRepository.count();
			Iterable<MimeTypes> mimeTypes;
			
			if(mimeTypesCount == 0) {
				throw new NoDataAvailableException();
			}
			else
			{
				mimeTypes = mimeTypesRepository.findAll();
				return new ResponseEntity<Object>(mimeTypes, HttpStatus.OK);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
	@RequestMapping(path="/deleteMimeType", method = RequestMethod.DELETE)
	public @ResponseBody ResponseEntity<?> deleteMimeType(@RequestBody MimeTypes mimeType) {
		try
		{
			if(mimeTypesRepository.findByMimeType(mimeType.getMime_type_name()).isPresent()) {
				mimeTypesRepository.delete(mimeType);
				return new ResponseEntity<Object>(mimeType, HttpStatus.OK);
			}
			else
			{
				throw new MimeTypeNotFoundException(mimeType);
			}
		}
		catch (DataAccessException ex)
		{
			/* All other errors send generic message to browser */
			return new ResponseEntity<HttpStatus>(HttpStatus.INTERNAL_SERVER_ERROR);
			
			/* TODO: log the exception */
		}
	}
	
}
