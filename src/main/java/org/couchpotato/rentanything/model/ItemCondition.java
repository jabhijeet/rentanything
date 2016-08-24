/**
 *
 */

package org.couchpotato.rentanything.model;

/**
 * @author jabhi
 *
 */
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
