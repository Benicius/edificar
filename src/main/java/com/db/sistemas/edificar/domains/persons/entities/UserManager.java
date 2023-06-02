package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.Address;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "user_manager")
public class UserManager extends Person {

  private String login;
  private String password;
/*
  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "company_id", nullable = false)
  private Company company;*/

  public UserManager(
      String name,
      String cpf,
      String cnpj,
      LocalDate birthday,
      String cellphone,
      Address addressId,
      Company companyId,
      String login,
      String password,
      Company company) {
    super(name, cpf, cnpj, birthday, cellphone, addressId, companyId);
    this.login = login;
    this.password = password;
  }
  public UserManager() {
  }
  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
