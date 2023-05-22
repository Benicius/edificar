package com.db.sistemas.edificar.domains.persons.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class UserManager extends Person {

  private String login;
  private String password;

  @ManyToOne(cascade = CascadeType.PERSIST)
  private Company company;

  public UserManager(
      String name,
      String cpf,
      String cnpj,
      LocalDate birthday,
      String cellphone,
      Long addressId,
      Long companyId,
      String login,
      String password,
      Company company) {
    super(name, cpf, cnpj, birthday, cellphone, addressId, companyId);
    this.login = login;
    this.password = password;
    this.company = company;
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

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }
}
