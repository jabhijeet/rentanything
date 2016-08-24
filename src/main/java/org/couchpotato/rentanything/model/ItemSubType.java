
package org.couchpotato.rentanything.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "itemSubTypes")
public class  ItemSubType extends BaseModel
{

	private final String description;

	/**
	 * @param description
	 */
	public ItemSubType(String description)
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
