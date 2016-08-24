
package org.couchpotato.rentanything.model;

import java.util.Date;

public class Remark extends BaseModel
{
	private String remarkText;
	private String remarkByCustomerId;
	private Date date;
	private String remarkType;
	private String remarkRefId;



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
	 * @return the date
	 */
	public Date getDate()
	{
		if (date != null)
		{
			return (Date) date.clone();
		}
		return null;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date)
	{
		this.date = date;
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

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Remark ["
				+ (remarkText != null ? "remarkText=" + remarkText + ", " : "")
				+ (remarkByCustomerId != null
				? "remarkByCustomerId=" + remarkByCustomerId + ", "
						: "")
				+ (date != null ? "date=" + date : "") + "]";
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = (prime * result) + ((date == null) ? 0 : date.hashCode());
		result = (prime * result) + ((remarkByCustomerId == null) ? 0
				: remarkByCustomerId.hashCode());
		result = (prime * result)
				+ ((remarkText == null) ? 0 : remarkText.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
		{
			return true;
		}
		if (!super.equals(obj))
		{
			return false;
		}
		if (!(obj instanceof Remark))
		{
			return false;
		}
		final Remark other = (Remark) obj;
		if (date == null)
		{
			if (other.date != null)
			{
				return false;
			}
		}
		else
			if (!date.equals(other.date))
			{
				return false;
			}
		if (remarkByCustomerId == null)
		{
			if (other.remarkByCustomerId != null)
			{
				return false;
			}
		}
		else
			if (!remarkByCustomerId.equals(other.remarkByCustomerId))
			{
				return false;
			}
		if (remarkText == null)
		{
			if (other.remarkText != null)
			{
				return false;
			}
		}
		else
			if (!remarkText.equals(other.remarkText))
			{
				return false;
			}
		return true;
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
	public String getRemarkRefId()
	{
		return remarkRefId;
	}

	/**
	 * @param remarkRefId the remarkRefId to set
	 */
	public void setRemarkRefId(String remarkRefId)
	{
		this.remarkRefId = remarkRefId;
	}

}
