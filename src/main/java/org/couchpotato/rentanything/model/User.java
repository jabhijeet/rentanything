
package org.couchpotato.rentanything.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the users database table.
 *
 */
@Entity
@Table(name = "users")
public class User extends BaseModel implements Serializable
{

	/**
	 *
	 */
	private static final long serialVersionUID = -6758748101732101374L;

	private String password;

	private String username;

	public User()
	{
	}

	public String getPassword()
	{
		return this.password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getUsername()
	{
		return this.username;
	}

	public void setUsername(String username)
	{
		this.username = username;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "User [" + (username != null ? "username=" + username : "")
				+ "]";
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
		result = (prime * result)
				+ ((username == null) ? 0 : username.hashCode());
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
		if (!(obj instanceof User))
		{
			return false;
		}
		final User other = (User) obj;
		if (username == null)
		{
			if (other.username != null)
			{
				return false;
			}
		}
		else
			if (!username.equals(other.username))
			{
				return false;
			}
		return true;
	}

}
