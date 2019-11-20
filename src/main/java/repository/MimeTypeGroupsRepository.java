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

import domain.MimeTypeGroups;

/**
 * @author Billy Bissic
 *
 */
public interface MimeTypeGroupsRepository extends CrudRepository<MimeTypeGroups, Long> {

	@Query("SELECT mime_type_group_id, mime_type_group_name, mime_type_group_description FROM MimeTypeGroups WHERE mime_type_group_name = ?1")
	Optional<Object> findByGroupName(String mime_type_group_name);

}
