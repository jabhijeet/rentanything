/**
 *
 */

package org.couchpotato.rentanything.model;

/**
 * @author jabhi
 *
 */
public class Place extends BaseModel
{
	private String area;
	private String city;
	private String state;
	private String Country;
	private String pincode;



	/**
	 *
	 */
	public Place()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the area
	 */
	public String getArea()
	{
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area)
	{
		this.area = area;
	}

	/**
	 * @return the city
	 */
	public String getCity()
	{
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city)
	{
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState()
	{
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state)
	{
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry()
	{
		return Country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country)
	{
		Country = country;
	}

	/**
	 * @return the pincode
	 */
	public String getPincode()
	{
		return pincode;
	}

	/**
	 * @param pincode
	 *            the pincode to set
	 */
	public void setPincode(String pincode)
	{
		this.pincode = pincode;
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
		result = (prime * result) + ((Country == null) ? 0 : Country.hashCode());
		result = (prime * result) + ((area == null) ? 0 : area.hashCode());
		result = (prime * result) + ((city == null) ? 0 : city.hashCode());
		result = (prime * result) + ((pincode == null) ? 0 : pincode.hashCode());
		result = (prime * result) + ((state == null) ? 0 : state.hashCode());
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
		if (!(obj instanceof Place))
		{
			return false;
		}
		final Place other = (Place) obj;
		if (Country == null)
		{
			if (other.Country != null)
			{
				return false;
			}
		}
		else
			if (!Country.equals(other.Country))
			{
				return false;
			}
		if (area == null)
		{
			if (other.area != null)
			{
				return false;
			}
		}
		else
			if (!area.equals(other.area))
			{
				return false;
			}
		if (city == null)
		{
			if (other.city != null)
			{
				return false;
			}
		}
		else
			if (!city.equals(other.city))
			{
				return false;
			}
		if (pincode == null)
		{
			if (other.pincode != null)
			{
				return false;
			}
		}
		else
			if (!pincode.equals(other.pincode))
			{
				return false;
			}
		if (state == null)
		{
			if (other.state != null)
			{
				return false;
			}
		}
		else
			if (!state.equals(other.state))
			{
				return false;
			}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Place [" + (area != null ? "area=" + area + ", " : "")
				+ (city != null ? "city=" + city + ", " : "")
				+ (state != null ? "state=" + state + ", " : "")
				+ (Country != null ? "Country=" + Country + ", " : "")
				+ (pincode != null ? "pincode=" + pincode : "") + "]";
	}

}
