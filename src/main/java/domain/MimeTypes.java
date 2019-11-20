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

/**
 * @author Billy Bissic
 *
 */
@Entity
public class MimeTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer mime_type_id; 
	private String mime_type_name;
	private String mime_type_template;
	private String mime_type_description;
	private Integer mime_type_group_id;
	
	/**
	 * @return the mime_type_id
	 */
	public Integer getMime_type_id() {
		return mime_type_id;
	}
	/**
	 * @param mime_type_id the mime_type_id to set
	 */
	public void setMime_type_id(Integer mime_type_id) {
		this.mime_type_id = mime_type_id;
	}
	/**
	 * @return the mime_type_name
	 */
	public String getMime_type_name() {
		return mime_type_name;
	}
	/**
	 * @param mime_type_name the mime_type_name to set
	 */
	public void setMime_type_name(String mime_type_name) {
		this.mime_type_name = mime_type_name;
	}
	/**
	 * @return the mime_type_template
	 */
	public String getMime_type_template() {
		return mime_type_template;
	}
	/**
	 * @param mime_type_template the mime_type_template to set
	 */
	public void setMime_type_template(String mime_type_template) {
		this.mime_type_template = mime_type_template;
	}
	/**
	 * @return the mime__type_description
	 */
	public String getMime_type_description() {
		return mime_type_description;
	}
	/**
	 * @param mime__type_description the mime__type_description to set
	 */
	public void setMime_type_description(String mime_type_description) {
		this.mime_type_description = mime_type_description;
	}
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
}
