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
import org.springframework.stereotype.Repository;

import domain.CaptionTypes;

/**
 * @author Billy Bissic
 *
 */

@Repository
public interface CaptionTypesRepository extends CrudRepository<CaptionTypes, Integer> {

	//@Query("SELECT caption_type_id, caption_type_name, caption_type_description FROM CaptionTypes WHERE caption_type_name = ?1")
	Optional<Iterable<CaptionTypes>> findByCaptionTypeName(String captionTypeName);

	/**
	 * @param caption_type_id
	 * @return
	 */
	CaptionTypes findById(Integer id);

	/**
	 * @param captionTypeName
	 * @return
	 */
	Iterable<CaptionTypes> getByCaptionTypeName(String captionTypeName);

	/**
	 * @param id
	 * @return
	 */
	
}
