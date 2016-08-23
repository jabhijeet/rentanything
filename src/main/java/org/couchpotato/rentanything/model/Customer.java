/**
 *
 */

package org.couchpotato.rentanything.model;

import java.util.List;

/**
 * @author jabhi
 *
 */
public class Customer extends BaseModel
{
	private String firstname;
	private String lastname;
	private String placeId;
	private List<String> remarkIds;



	/**
	 *
	 */
	public Customer()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the firstname
	 */
	public String getFirstname()
	{
		return firstname;
	}

	/**
	 * @param firstname
	 *            the firstname to set
	 */
	public void setFirstname(String firstname)
	{
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname()
	{
		return lastname;
	}

	/**
	 * @param lastname
	 *            the lastname to set
	 */
	public void setLastname(String lastname)
	{
		this.lastname = lastname;
	}

	/**
	 * @return the placeId
	 */
	public String getPlaceId()
	{
		return placeId;
	}

	/**
	 * @param placeId
	 *            the placeId to set
	 */
	public void setPlaceId(String placeId)
	{
		this.placeId = placeId;
	}

	/**
	 * @return the remarkIds
	 */
	public List<String> getRemarkIds()
	{
		return remarkIds;
	}

	/**
	 * @param remarkIds the remarkIds to set
	 */
	public void setRemarkIds(List<String> remarkIds)
	{
		this.remarkIds = remarkIds;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Customer ["
				+ (firstname != null ? "firstname=" + firstname + ", " : "")
				+ (lastname != null ? "lastname=" + lastname : "") + "]";
	}



}
