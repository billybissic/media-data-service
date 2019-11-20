/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import domain.MimeTypeObjects;
import domain.MimeTypes;;

/**
 * @author Billy Bissic
 *
 */
public interface MimeTypesRepository extends CrudRepository<MimeTypes, Long> {

	@Query("SELECT mime_type_id, mime_type_name, mime_type_description, mime_type_group_id FROM MimeTypes WHERE mime_type_name = ?1")
	Optional<Object> findByMimeType(String mime_type);

	@Query("SELECT mime_type_id, mime_type_name, mime_type_template, mime_type_description, mime_type_group_id FROM MimeTypes WHERE mime_type_group_id = ?1")
	Optional<Iterable<Object>> findByMimeGroup(Integer mime_type_group_id);

	@Query("SELECT mt.mime_type_id,                               \n"
		 + "       mt.mime_type_name,                             \n"
		 + "       mt.mime_type_template,                         \n"
		 + "       mt.mime_type_description,                      \n"
		 + "       mtg.mime_type_group_name                       \n"
		 + "  FROM MimeTypes AS mt,                               \n"
		 + "       MimeTypeGroups AS mtg                          \n"
		 + " WHERE mt.mime_type_group_id = mtg.mime_type_group_id \n"
		 + "   AND mt.mime_type_group_id = ?1   					")
	Iterable<Object> findAllMimesForGroup(Integer mime_type_group_id);

}
