
package org.couchpotato.rentanything.common;

public enum ItemSubType
{
	MOBILES("Mobiles"), TABLETS("Ipads and Tablets"), CARS("Cars"), MOTORBIKES(
			"Motorbikes"), CYCLES("Cycles"), HOME_APPLIANCES(
					"HomeAppliances"), PHOTOGRAPHY("Photography");
	private final String description;

	/**
	 * @param description
	 */
	private ItemSubType(String description)
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
