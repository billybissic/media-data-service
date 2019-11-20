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
@Table(name="caption")
public class Captions {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer caption_id; 
	private Integer language_code; 
	private Integer caption_type_id; 
	private Integer caption_sub_type_id;
	private String caption;
	private String caption_timestamp;
	private String last_changed_timestamp;
	private Integer last_changed_by_uuid;
	
	/**
	 * @return the caption_id
	 */
	public Integer getCaption_id() {
		return caption_id;
	}
	/**
	 * @param caption_id the caption_id to set
	 */
	public void setCaption_id(Integer caption_id) {
		this.caption_id = caption_id;
	}
	/**
	 * @return the language_code
	 */
	public Integer getLanguage_code() {
		return language_code;
	}
	/**
	 * @param language_code the language_code to set
	 */
	public void setLanguage_code(Integer language_code) {
		this.language_code = language_code;
	}
	/**
	 * @return the caption_type_id
	 */
	public Integer getCaption_type_id() {
		return caption_type_id;
	}
	/**
	 * @param caption_type_id the caption_type_id to set
	 */
	public void setCaption_type_id(Integer caption_type_id) {
		this.caption_type_id = caption_type_id;
	}
	/**
	 * @return the caption_sub_type_id
	 */
	public Integer getCaption_sub_type_id() {
		return caption_sub_type_id;
	}
	/**
	 * @param caption_sub_type_id the caption_sub_type_id to set
	 */
	public void setCaption_sub_type_id(Integer caption_sub_type_id) {
		this.caption_sub_type_id = caption_sub_type_id;
	}
	/**
	 * @return the caption
	 */
	public String getCaption() {
		return caption;
	}
	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}
	/**
	 * @return the caption_timestamp
	 */
	public String getCaption_timestamp() {
		return caption_timestamp;
	}
	/**
	 * @param caption_timestamp the caption_timestamp to set
	 */
	public void setCaption_timestamp(String caption_timestamp) {
		this.caption_timestamp = caption_timestamp;
	}
	/**
	 * @return the last_modified_timestamp
	 */
	public String getLast_changed_timestamp() {
		return last_changed_timestamp;
	}
	/**
	 * @param last_modified_timestamp the last_modified_timestamp to set
	 */
	public void setLast_changed_timestamp(String last_modified_timestamp) {
		this.last_changed_timestamp = last_modified_timestamp;
	}
	/**
	 * @return the uuid
	 */
	public Integer getLast_changed_by_uuid() {
		return last_changed_by_uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setLast_changed_by_uuid(Integer uuid) {
		this.last_changed_by_uuid = uuid;
	}
}
