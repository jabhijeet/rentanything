/**
 *
 */

package org.couchpotato.rentanything.model;

import java.util.List;

import org.couchpotato.rentanything.common.Amount;
import org.couchpotato.rentanything.common.ItemSubType;
import org.couchpotato.rentanything.common.ItemType;

/**
 * @author jabhi
 *
 */
public class Item extends BaseModel
{
	private String title;
	private String description;
	private ItemType type;
	private ItemSubType subtype;
	private Integer availableQuantity;
	private String color;
	private Amount price;
	private String company;
	private String model;
	private String customerId;
	private List<String> feedbackIds;

	/**
	 *
	 */
	public Item()
	{

	}

	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * @param title
	 *            the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}

	/**
	 * @return the type
	 */
	public ItemType getType()
	{
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(ItemType type)
	{
		this.type = type;
	}

	/**
	 * @return the subtype
	 */
	public ItemSubType getSubtype()
	{
		return subtype;
	}

	/**
	 * @param subtype
	 *            the subtype to set
	 */
	public void setSubtype(ItemSubType subtype)
	{
		this.subtype = subtype;
	}

	/**
	 * @return the availableQuantity
	 */
	public Integer getAvailableQuantity()
	{
		return availableQuantity;
	}

	/**
	 * @param availableQuantity
	 *            the availableQuantity to set
	 */
	public void setAvailableQuantity(Integer availableQuantity)
	{
		this.availableQuantity = availableQuantity;
	}

	/**
	 * @return the color
	 */
	public String getColor()
	{
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color)
	{
		this.color = color;
	}

	/**
	 * @return the price
	 */
	public Amount getPrice()
	{
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Amount price)
	{
		this.price = price;
	}

	/**
	 * @return the company
	 */
	public String getCompany()
	{
		return company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(String company)
	{
		this.company = company;
	}

	/**
	 * @return the model
	 */
	public String getModel()
	{
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model)
	{
		this.model = model;
	}

	/**
	 * @return the customerId
	 */
	public String getCustomerId()
	{
		return customerId;
	}

	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	/**
	 * @return the feedbackIds
	 */
	public List<String> getFeedbackIds()
	{
		return feedbackIds;
	}

	/**
	 * @param feedbackIds the feedbackIds to set
	 */
	public void setFeedbackIds(List<String> feedbackIds)
	{
		this.feedbackIds = feedbackIds;
	}



}
