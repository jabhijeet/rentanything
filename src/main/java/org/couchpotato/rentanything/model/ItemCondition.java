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
@Table(name = "itemConditions")
public class ItemCondition extends BaseModel
{

	private final String description;

	public ItemCondition(String description)
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
