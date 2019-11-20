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

import domain.MediaTypes;

/**
 * @author Billy Bissic
 *
 */
public interface MediaTypesRepository extends CrudRepository<MediaTypes, Long> {

	@Query("SELECT media_type_id, media_type_name, media_type_abbreviation, media_type_description, mime_type_group_id FROM MediaTypes WHERE media_type_name = ?1")
	Optional<Object> findByMediaTypeName(String media_type_name);

}
