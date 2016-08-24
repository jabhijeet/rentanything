
package org.couchpotato.rentanything.model;

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
