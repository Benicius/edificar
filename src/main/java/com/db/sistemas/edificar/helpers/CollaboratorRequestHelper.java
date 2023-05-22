package com.db.sistemas.edificar.helpers;

import com.db.sistemas.edificar.builders.persons.CollaboratorBuilder;
import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.persons.entities.Collaborator;
import com.db.sistemas.edificar.domains.persons.entities.Company;
import com.db.sistemas.edificar.domains.persons.requests.CollaboratorRequest;

public class CollaboratorRequestHelper {

	public Collaborator collaboratorBuilder(final CollaboratorRequest collaboratorRequest){
		return new CollaboratorBuilder()
						.setName(collaboratorRequest.getName())
						.setCpf(collaboratorRequest.getCpf())
						.setCnpj(collaboratorRequest.getCnpj())
						.setBirthday(collaboratorRequest.getBirthday())
						.setCellphone(collaboratorRequest.getCellphone())
						.setCompanyId(collaboratorRequest.getCompany().getId())
						.setAddressId(collaboratorRequest.getAddress().getId())
						.setPaymentFormatEnum(collaboratorRequest.getPayFormat())
						.setPayment(collaboratorRequest.getPayment())
						.setWorkTime(collaboratorRequest.getWorkTime())
						.build();
	}

	public Address collaboratorAddressBuilder(final CollaboratorRequest collaboratorRequest){
		return null;
	}

	public Company collaboratorCompanyBuilder(final CollaboratorRequest collaboratorRequest){
		return null;
	}
}
