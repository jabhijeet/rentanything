
package org.couchpotato.rentanything.common;

import java.math.BigDecimal;

public class Amount
{
	private final String currency;
	private final BigDecimal price;
	private final PriceUnit unit;

	/**
	 * @param currency
	 * @param price
	 * @param unit
	 */
	public Amount(String currency, BigDecimal price, PriceUnit unit)
	{
		this.currency = currency;
		this.price = price;
		this.unit = unit;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Amount ["
				+ (currency != null ? "currency=" + currency + ", " : "")
				+ (price != null ? "price=" + price + ", " : "")
				+ (unit != null ? "unit=" + unit : "") + "]";
	}

}
