/**
 *
 */

package org.couchpotato.rentanything.common;

/**
 * @author jabhi
 *
 */
public enum ItemType
{

	ELECTRONICS("Electronics"), AUTOMOBILES("Automobiles"), SPORTING_GEARS(
			"Sporting Gears"), BOOKS("Books"), MISC("Miscellaneous");
	private final String description;

	private ItemType(String description)
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
