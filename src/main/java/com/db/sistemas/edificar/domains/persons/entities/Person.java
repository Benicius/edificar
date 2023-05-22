package com.db.sistemas.edificar.domains.persons.entities;

import javax.persistence.*;
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
  private Long addressId;

  @Column(name = "company_id", insertable = false, updatable = false)
  private Long companyId;

  public Person(
      String name,
      String cpf,
      String cnpj,
      LocalDate birthday,
      String cellphone,
      Long addressId,
      Long companyId) {
    this.name = name;
    this.cpf = cpf;
    this.cnpj = cnpj;
    this.birthday = birthday;
    this.cellphone = cellphone;
    this.addressId = addressId;
    this.companyId = companyId;
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

  public Long getAddressId() {
    return addressId;
  }

  public void setAddressId(Long addressId) {
    this.addressId = addressId;
  }

  public Long getCompanyId() {
    return companyId;
  }

  public void setCompanyId(Long companyId) {
    this.companyId = companyId;
  }
}
