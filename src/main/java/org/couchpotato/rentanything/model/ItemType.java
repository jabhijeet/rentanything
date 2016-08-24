/**
 *
 */

package org.couchpotato.rentanything.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jabhi
 *
 */
@Entity
@Table(name = "itemTypes")
public class ItemType extends BaseModel
{

	private final String description;

	public ItemType(String description)
	{
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

}
