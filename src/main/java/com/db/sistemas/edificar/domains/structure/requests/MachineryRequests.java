package com.db.sistemas.edificar.domains.structure.requests;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.structure.PaymentFormatEnum;

import java.math.BigDecimal;
import java.time.LocalDate;

public record MachineryRequests(PaymentFormatEnum paymentFormat,
                                String power,
                                LocalDate leaseDate,
                                String name,
                                String description,
                                BigDecimal price,
                                Address address) {
}
