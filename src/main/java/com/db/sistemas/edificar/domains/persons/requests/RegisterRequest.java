package com.db.sistemas.edificar.domains.persons.requests;

import com.db.sistemas.edificar.domains.AddressRequest;
import com.db.sistemas.edificar.domains.persons.entities.Company;

import java.time.LocalDate;


public record RegisterRequest(
        String name,
        String username,
        String password,
        String cpf,
        String cnpj,
        LocalDate birthday,
        String cellphone,
        AddressRequest address,
        Company company
) {

}
