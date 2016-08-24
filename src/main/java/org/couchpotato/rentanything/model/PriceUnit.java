/**
 *
 */

package org.couchpotato.rentanything.model;

/**
 * @author jabhi
 *
 */
public class PriceUnit extends BaseModel
{

	private final String description;

	/**
	 * @param description
	 */
	public PriceUnit(String description)
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
