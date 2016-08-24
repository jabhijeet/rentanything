/**
 *
 */

package org.couchpotato.rentanything.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author jabhi
 *
 */
@Entity
@Table(name = "items")
public class Item extends BaseModel implements Serializable
{
	private String title;
	private String description;
	private String type;
	private String subtype;
	private Integer availableQuantity;
	private String itemCondition;
	private String currency;
	private BigDecimal price;
	private String priceUnit;
	private String company;
	private String model;
	private String userId;
	private String placeId;
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
	 * @return the price
	 */
	public BigDecimal getPrice()
	{
		return price;
	}

	/**
	 * @param price
	 *            the price to set
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
	 * @param priceUnit
	 *            the priceUnit to set
	 */
	public void setPriceUnit(String priceUnit)
	{
		this.priceUnit = priceUnit;
	}

	/**
	 * @return the type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * @param type
	 *            the type to set
	 */
	public void setType(String type)
	{
		this.type = type;
	}

	/**
	 * @return the subtype
	 */
	public String getSubtype()
	{
		return subtype;
	}

	/**
	 * @param subtype
	 *            the subtype to set
	 */
	public void setSubtype(String subtype)
	{
		this.subtype = subtype;
	}

	/**
	 * @return the itemCondition
	 */
	public String getItemCondition()
	{
		return itemCondition;
	}

	/**
	 * @param itemCondition
	 *            the itemCondition to set
	 */
	public void setItemCondition(String itemCondition)
	{
		this.itemCondition = itemCondition;
	}

	/**
	 * @return the currency
	 */
	public String getCurrency()
	{
		return currency;
	}

	/**
	 * @param currency
	 *            the currency to set
	 */
	public void setCurrency(String currency)
	{
		this.currency = currency;
	}

	/**
	 * @return the placeId
	 */
	public String getPlaceId()
	{
		return placeId;
	}

	/**
	 * @param placeId the placeId to set
	 */
	public void setPlaceId(String placeId)
	{
		this.placeId = placeId;
	}

	/**
	 * @return the userId
	 */
	public String getUserId()
	{
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId)
	{
		this.userId = userId;
	}

}
