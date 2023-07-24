package com.db.sistemas.edificar.factory;

import java.math.BigDecimal;

public interface PaymentFactory {

	BigDecimal wayToPay(final BigDecimal price, final Double dayHourMouth);
}
