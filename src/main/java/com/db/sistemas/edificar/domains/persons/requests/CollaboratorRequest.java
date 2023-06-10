package com.db.sistemas.edificar.domains.persons.requests;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.PaymentFormatEnum;
import com.db.sistemas.edificar.domains.persons.entities.Company;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CollaboratorRequest(
				PaymentFormatEnum payFormat,
				BigDecimal payment,
				Integer workTime,
				Long id,
				String name,
				String cpf,
				String cnpj,
				LocalDate birthday,
				String cellphone,
				Address address,
				Company company) {

}
