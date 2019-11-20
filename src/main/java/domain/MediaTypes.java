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
@Table(name="media_types")
public class MediaTypes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer media_type_id; 
	private String media_type_name;
	private String media_type_abbreviation; 
	private String media_type_description; 
	private Integer mime_type_group_id;
	
	/**
	 * @return the media_type_id
	 */
	public Integer getMedia_type_id() {
		return media_type_id;
	}
	/**
	 * @param media_type_id the media_type_id to set
	 */
	public void setMedia_type_id(Integer media_type_id) {
		this.media_type_id = media_type_id;
	}
	/**
	 * @return the media_type_name
	 */
	public String getMedia_type_name() {
		return media_type_name;
	}
	/**
	 * @param media_type_name the media_type_name to set
	 */
	public void setMedia_type_name(String media_type_name) {
		this.media_type_name = media_type_name;
	}
	/**
	 * @return the media_type_abbreviation
	 */
	public String getMedia_type_abbreviation() {
		return media_type_abbreviation;
	}
	/**
	 * @param media_type_abbreviation the media_type_abbreviation to set
	 */
	public void setMedia_type_abbreviation(String media_type_abbreviation) {
		this.media_type_abbreviation = media_type_abbreviation;
	}
	/**
	 * @return the media_type_description
	 */
	public String getMedia_type_description() {
		return media_type_description;
	}
	/**
	 * @param media_type_description the media_type_description to set
	 */
	public void setMedia_type_description(String media_type_description) {
		this.media_type_description = media_type_description;
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
