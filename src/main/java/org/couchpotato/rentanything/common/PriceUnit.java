/**
 *
 */

package org.couchpotato.rentanything.common;

/**
 * @author jabhi
 *
 */
public enum PriceUnit
{
	PER_DAY("per Day"), PER_HOUR("per Hour"), PER_WEEK("per Week"), PER_MONTH(
			"per Month");
	private final String description;

	/**
	 * @param description
	 */
	private PriceUnit(String description)
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
