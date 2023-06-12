package com.db.sistemas.edificar.domains.persons.requests;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.persons.entities.Company;

import java.time.LocalDate;

public record UserRequests(
				String username,
				String password,
				String name,
				String cpf,
				String cnpj,
				LocalDate birthday,
				String cellphone,
				Address address,
				Company company) {
}
