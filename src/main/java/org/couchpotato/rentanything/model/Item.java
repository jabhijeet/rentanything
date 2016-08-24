/**
 *
 */

package org.couchpotato.rentanything.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jabhi
 *
 */
@Entity
@Table(name = "items")
public class Item extends BaseModel
{
	private String title;
	private String description;
	private String typeId;
	private String subtypeId;
	private Integer availableQuantity;
	private String color;
	private String currency;
	private BigDecimal price;
	private String priceUnit;
	private String company;
	private String model;
	private String customerId;

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
	 * @param customerId
	 *            the customerId to set
	 */
	public void setCustomerId(String customerId)
	{
		this.customerId = customerId;
	}

	/**
	 * @return the typeId
	 */
	public String getTypeId()
	{
		return typeId;
	}

	/**
	 * @param typeId the typeId to set
	 */
	public void setTypeId(String typeId)
	{
		this.typeId = typeId;
	}

	/**
	 * @return the subtypeId
	 */
	public String getSubtypeId()
	{
		return subtypeId;
	}

	/**
	 * @param subtypeId the subtypeId to set
	 */
	public void setSubtypeId(String subtypeId)
	{
		this.subtypeId = subtypeId;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency()
	{
		return currency;
	}

	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice()
	{
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	/**
	 * @return the priceUnit
	 */
	public String getPriceUnit()
	{
		return priceUnit;
	}

	/**
	 * @param priceUnit the priceUnit to set
	 */
	public void setPriceUnit(String priceUnit)
	{
		this.priceUnit = priceUnit;
	}


}
