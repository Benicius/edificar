package com.db.sistemas.edificar.factory;

import java.math.BigDecimal;

public class DayFactory  implements PaymentFactory{
	@Override
	public BigDecimal wayToPay(final BigDecimal price, final Double day) {
		return null;
	}
}
