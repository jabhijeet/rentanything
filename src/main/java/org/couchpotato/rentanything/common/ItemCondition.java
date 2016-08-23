/**
 * 
 */

package org.couchpotato.rentanything.common;

/**
 * @author jabhi
 *
 */
public enum ItemCondition
{
	NEW("New"), USED("Used");
	private final String name;

	private ItemCondition(String name)
	{
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

}
