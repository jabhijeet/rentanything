/**
 *
 */

package org.couchpotato.rentanything.model;

/**
 * @author jabhi
 *
 */
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
