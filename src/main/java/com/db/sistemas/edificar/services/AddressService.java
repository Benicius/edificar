package com.db.sistemas.edificar.services;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.AddressRequest;
import com.db.sistemas.edificar.repository.persons.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AddressService {

	private final AddressRepository addressRepository;

	public Address getAddress(final AddressRequest request){
		var address = Address.builder()
										.id(request.id())
										.city(request.city())
										.complement(request.complement())
										.country(request.country())
										.district(request.district())
										.number(request.number())
										.postalCode(request.postalCode())
										.state(request.state())
										.street(request.street())
										.build();
		if (address.getId() != null){
			address =
							addressRepository.findById(address.getId()).orElseThrow();
		} else {
			address = addressRepository.save(address);
		}
		return address;
	}
}
