package com.db.sistemas.edificar.domains;

public record AddressRequest(Long id,
                             String street,
                             Integer number,
                             String complement,
                             String postalCode,
                             String district,
                             String city,
                             String state,
                             String country) {
}
