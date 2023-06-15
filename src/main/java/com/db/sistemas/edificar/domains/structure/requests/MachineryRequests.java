package com.db.sistemas.edificar.domains.structure.requests;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.structure.entities.LeaseType;

import java.math.BigDecimal;
import java.time.LocalDate;

public record MachineryRequests(LeaseType leaseType,
                                String power,
                                LocalDate leaseDate,
                                String name,
                                String description,
                                BigDecimal price,
                                Address address) {
}
