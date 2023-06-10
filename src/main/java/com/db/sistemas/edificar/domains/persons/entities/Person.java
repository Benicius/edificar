package com.db.sistemas.edificar.domains.persons.entities;

import com.db.sistemas.edificar.domains.Address;
import jakarta.persistence.*;

import java.time.LocalDate;

@MappedSuperclass
public abstract class Person {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;
  private String cpf;
  private String cnpj;
  private LocalDate birthday;
  private String cellphone;
  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "address_id", nullable = false)
  private Address address;

  @ManyToOne(cascade = CascadeType.PERSIST)
  @JoinColumn(name = "company_id", nullable = false)
  private Company company;

  public Person() {
  }

  public Person(
      String name,
      String cpf,
      String cnpj,
      LocalDate birthday,
      String cellphone,
      Address addressId,
      Company companyId) {
    this.name = name;
    this.cpf = cpf;
    this.cnpj = cnpj;
    this.birthday = birthday;
    this.cellphone = cellphone;
    this.address = addressId;
    this.company = companyId;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }

  public String getCellphone() {
    return cellphone;
  }

  public void setCellphone(String cellphone) {
    this.cellphone = cellphone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }
}
