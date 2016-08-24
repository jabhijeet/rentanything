
package org.couchpotato.rentanything.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "remarks")
public class Remark extends BaseModel implements Serializable
{
	private String remarkText;
	private String remarkByCustomerId;
	private Date createdDate;
	private Date modifiedDate;
	private String remarkType;
	private String remarkForId;



	/**
	 * @return the createdDate
	 */
	public Date getCreatedDate()
	{
		return createdDate;
	}

	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}

	/**
	 * @return the modifiedDate
	 */
	public Date getModifiedDate()
	{
		return modifiedDate;
	}

	/**
	 * @param modifiedDate the modifiedDate to set
	 */
	public void setModifiedDate(Date modifiedDate)
	{
		this.modifiedDate = modifiedDate;
	}

	/**
	 *
	 */
	public Remark()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the remarkText
	 */
	public String getRemarkText()
	{
		return remarkText;
	}

	/**
	 * @param remarkText
	 *            the remarkText to set
	 */
	public void setRemarkText(String remarkText)
	{
		this.remarkText = remarkText;
	}



	/**
	 * @return the remarkByCustomerId
	 */
	public String getRemarkByCustomerId()
	{
		return remarkByCustomerId;
	}

	/**
	 * @param remarkByCustomerId
	 *            the remarkByCustomerId to set
	 */
	public void setRemarkByCustomerId(String remarkByCustomerId)
	{
		this.remarkByCustomerId = remarkByCustomerId;
	}


	/**
	 * @return the remarkType
	 */
	public String getRemarkType()
	{
		return remarkType;
	}

	/**
	 * @param remarkType the remarkType to set
	 */
	public void setRemarkType(String remarkType)
	{
		this.remarkType = remarkType;
	}

	/**
	 * @return the remarkRefId
	 */
	public String getRemarkForId()
	{
		return remarkForId;
	}

	/**
	 * @param remarkRefId the remarkRefId to set
	 */
	public void setRemarkForId(String remarkForId)
	{
		this.remarkForId = remarkForId;
	}

}
