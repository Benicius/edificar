package com.db.sistemas.edificar.factory;

import com.db.sistemas.edificar.domains.structure.PaymentFormatEnum;


public class DeliveryPaymentFactory {
	public PaymentFactory getPaymentFormat(final PaymentFormatEnum paymentType) {
		return switch (paymentType) {
			case HOURS -> new HourFactory();
			case DAY -> new DayFactory();
			case MOUTH -> new MouthFactory();
			default -> throw new IllegalArgumentException("Invalid payment type: " + paymentType);
		};
	}
}
