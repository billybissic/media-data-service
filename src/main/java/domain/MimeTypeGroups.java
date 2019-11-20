/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Billy Bissic
 *
 */
@Entity
@Table(name="mime_type_groups")
public class MimeTypeGroups {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mime_type_group_id;
	private String mime_type_group_name;
	private String mime_type_group_description;
	
	/**
	 * @return the mime_type_group_id
	 */
	public Integer getMime_type_group_id() {
		return mime_type_group_id;
	}
	/**
	 * @param mime_type_group_id the mime_type_group_id to set
	 */
	public void setMime_type_group_id(Integer mime_type_group_id) {
		this.mime_type_group_id = mime_type_group_id;
	}
	/**
	 * @return the mime_type_group_name
	 */
	public String getMime_type_group_name() {
		return mime_type_group_name;
	}
	/**
	 * @param mime_type_group_name the mime_type_group_name to set
	 */
	public void setMime_type_group_name(String mime_type_group_name) {
		this.mime_type_group_name = mime_type_group_name;
	}
	/**
	 * @return the mime_type_group_description
	 */
	public String getMime_type_group_description() {
		return mime_type_group_description;
	}
	/**
	 * @param mime_type_group_description the mime_type_group_description to set
	 */
	public void setMime_type_group_description(String mime_type_group_description) {
		this.mime_type_group_description = mime_type_group_description;
	}
}
