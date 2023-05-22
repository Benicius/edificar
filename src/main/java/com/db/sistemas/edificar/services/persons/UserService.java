package com.db.sistemas.edificar.services.persons;

import com.db.sistemas.edificar.domains.persons.entities.UserManager;
import com.db.sistemas.edificar.repository.CompanyRepository;
import com.db.sistemas.edificar.repository.persons.AddressRepository;
import com.db.sistemas.edificar.repository.persons.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private final UserRepository userRepository;
  private final CompanyRepository companyRepository;
  private final AddressRepository addressRepository;

  @Autowired
  public UserService(
      UserRepository userRepository,
      CompanyRepository companyRepository,
      AddressRepository addressRepository) {
    this.userRepository = userRepository;
    this.companyRepository = companyRepository;
    this.addressRepository = addressRepository;
  }

  public UserManager save(final UserManager userManager) {
    return userRepository.save(userManager);
  }

  public List<UserManager> findAll() {
    return userRepository.findAll();
  }
}
