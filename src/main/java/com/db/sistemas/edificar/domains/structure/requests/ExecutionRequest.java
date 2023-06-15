package com.db.sistemas.edificar.domains.structure.requests;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.structure.entities.ExecutionType;

import java.math.BigDecimal;

public record ExecutionRequest(ExecutionType executionType,
                               String name,
                               String description,
                               BigDecimal price,
                               Address address) {
}
