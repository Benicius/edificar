package com.db.sistemas.edificar.services.persons;

import com.db.sistemas.edificar.domains.Address;
import com.db.sistemas.edificar.domains.persons.entities.UserManager;
import com.db.sistemas.edificar.domains.persons.requests.UserRequests;
import com.db.sistemas.edificar.repository.CompanyRepository;
import com.db.sistemas.edificar.repository.persons.AddressRepository;
import com.db.sistemas.edificar.repository.persons.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

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

  public UserManager save(final UserRequests userRequests) {
    var userManager = new UserManager();
    BeanUtils.copyProperties(userRequests, userManager);
    if (userRequests.address().id() == null){
      Address address = new Address();
      BeanUtils.copyProperties(userRequests.address(), address);
      addressRepository.save(address);
      userManager.setAddress(address);
    }
    return userRepository.save(userManager);
  }

  public List<UserManager> findAll() {
    return userRepository.findAll();
  }
}
