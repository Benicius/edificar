package com.db.sistemas.edificar.domains.structure.requests;

import com.db.sistemas.edificar.domains.Address;

import java.math.BigDecimal;

public record WorkTypeRequest(String name,
                              String description,
                              BigDecimal price,
                              Address address) {
}
