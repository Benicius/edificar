package com.db.sistemas.edificar.factory;

import java.math.BigDecimal;

public class MouthFactory  implements PaymentFactory{
	@Override
	public BigDecimal wayToPay(final BigDecimal price, final Double mouth) {
		return price.multiply(new BigDecimal(mouth));
	}
}
