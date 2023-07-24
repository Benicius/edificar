package com.db.sistemas.edificar.factory;

import java.math.BigDecimal;

public class HourFactory implements PaymentFactory{
	@Override
	public BigDecimal wayToPay(final BigDecimal price, final Double hour) {
		return null;
	}
}
