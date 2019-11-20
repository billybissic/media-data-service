/**
 * 
 * @license
 * Copyright Billy Bissic. All Rights Reserved.
 *
 * Use of this source code is governed by an MIT-style license that can be
 * found in the LICENSE file at http://www.magnificenteyes.com/magnificent-essentials/license
 */
package domain;

import javax.persistence.Column;
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
@Table(name="caption_types")
public class CaptionTypes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "caption_type_id")
	private Integer id;
	@Column(name = "caption_type_name")
	private String captionTypeName; 
	private String caption_type_description;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the captionTypeName
	 */
	public String getCaptionTypeName() {
		return captionTypeName;
	}
	/**
	 * @param captionTypeName the captionTypeName to set
	 */
	public void setCaptionTypeName(String captionTypeName) {
		captionTypeName = captionTypeName;
	}
	/**
	 * @return the caption_type_description
	 */
	public String getCaption_type_description() {
		return caption_type_description;
	}
	/**
	 * @param caption_type_description the caption_type_description to set
	 */
	public void setCaption_type_description(String caption_type_description) {
		this.caption_type_description = caption_type_description;
	}
}
