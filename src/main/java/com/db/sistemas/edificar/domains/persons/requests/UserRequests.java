package com.db.sistemas.edificar.domains.persons.requests;

import com.db.sistemas.edificar.domains.AddressRequest;
import com.db.sistemas.edificar.domains.persons.entities.Company;
import com.db.sistemas.edificar.domains.persons.entities.RoleModel;

import java.time.LocalDate;
import java.util.List;

public record UserRequests(
				String username,
				String password,
				String name,
				String cpf,
				String cnpj,
				LocalDate birthday,
				String cellphone,
				List<RoleModel> roles,
				AddressRequest address,
				Company company) {
}
